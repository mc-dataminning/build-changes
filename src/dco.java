import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dco(dco.a e, IntList f, IntList g, boolean h, boolean i) implements ddf {
   public static final dco a = new dco(dco.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dco> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dco.a.g.fieldOf("shape").forGetter(dco::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dco::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dco::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dco::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dco::e)
            )
            .apply($$0, dco::new)
   );
   private static final za<ByteBuf, IntList> j = yy.g.a(yy.a()).a(IntArrayList::new, ArrayList::new);
   public static final za<ByteBuf, dco> d = za.a(dco.a.f, dco::a, j, dco::b, j, dco::c, yy.b, dco::d, yy.b, dco::e, dco::new);
   private static final xc k = xc.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      $$1.accept(this.e.a().a(o.h));
      this.a($$1);
   }

   public void a(Consumer<xc> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xc.i().a(o.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xc.c("item.minecraft.firework_star.fade_to").b(xb.v).a(o.h), this.g));
      }

      if (this.h) {
         $$0.accept(xc.c("item.minecraft.firework_star.trail").a(o.h));
      }

      if (this.i) {
         $$0.accept(xc.c("item.minecraft.firework_star.flicker").a(o.h));
      }
   }

   private static xc a(xq $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xc a(int $$0) {
      cyy $$1 = cyy.b($$0);
      return (xc)($$1 == null ? k : xc.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dco a(IntList $$0) {
      return new dco(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dco.a a() {
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

   public static enum a implements bao {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dco.a> h = ayg.a(dco.a::b, values(), ayg.a.a);
      public static final za<ByteBuf, dco.a> f = yy.a(h, dco.a::b);
      public static final Codec<dco.a> g = bao.b(dco.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xq a() {
         return xc.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dco.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
