import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record czb(czb.a e, IntList f, IntList g, boolean h, boolean i) implements czp {
   public static final czb a = new czb(czb.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<czb> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czb.a.g.fieldOf("shape").forGetter(czb::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(czb::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(czb::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(czb::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(czb::e)
            )
            .apply($$0, czb::new)
   );
   private static final zh<ByteBuf, IntList> j = zf.g.a(zf.a()).a(IntArrayList::new, ArrayList::new);
   public static final zh<ByteBuf, czb> d = zh.a(czb.a.f, czb::a, j, czb::b, j, czb::c, zf.b, czb::d, zf.b, czb::e, czb::new);
   private static final xj k = xj.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xj> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xj> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xj.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xj.c("item.minecraft.firework_star.fade_to").b(xi.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xj.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xj.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xj a(xx $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xj a(int $$0) {
      cvj $$1 = cvj.b($$0);
      return (xj)($$1 == null ? k : xj.c("item.minecraft.firework_star." + $$1.b()));
   }

   public czb a(IntList $$0) {
      return new czb(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public czb.a a() {
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

   public static enum a implements bai {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<czb.a> h = ayd.a(czb.a::b, values(), ayd.a.a);
      public static final zh<ByteBuf, czb.a> f = zf.a(h, czb.a::b);
      public static final Codec<czb.a> g = bai.b(czb.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xx a() {
         return xj.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static czb.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
