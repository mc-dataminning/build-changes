import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cyq(cyq.a e, IntList f, IntList g, boolean h, boolean i) implements cze {
   public static final cyq a = new cyq(cyq.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cyq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyq.a.g.fieldOf("shape").forGetter(cyq::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cyq::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cyq::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cyq::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cyq::e)
            )
            .apply($$0, cyq::new)
   );
   private static final zg<ByteBuf, IntList> j = ze.g.a(ze.a()).a(IntArrayList::new, ArrayList::new);
   public static final zg<ByteBuf, cyq> d = zg.a(cyq.a.f, cyq::a, j, cyq::b, j, cyq::c, ze.b, cyq::d, ze.b, cyq::e, cyq::new);
   private static final xi k = xi.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xi> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xi> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xi.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xi.c("item.minecraft.firework_star.fade_to").b(xh.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xi.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xi.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xi a(xw $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xi a(int $$0) {
      cuy $$1 = cuy.b($$0);
      return (xi)($$1 == null ? k : xi.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cyq a(IntList $$0) {
      return new cyq(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cyq.a a() {
      return this.e;
   }

   public IntList b() {
      return this.f;
   }

   public IntList c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public static enum a implements bag {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cyq.a> h = ayb.a(cyq.a::b, values(), ayb.a.a);
      public static final zg<ByteBuf, cyq.a> f = ze.a(h, cyq.a::b);
      public static final Codec<cyq.a> g = bag.b(cyq.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xw a() {
         return xi.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cyq.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
