import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cxl(cxl.a e, IntList f, IntList g, boolean h, boolean i) implements cxy {
   public static final cxl a = new cxl(cxl.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cxl> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxl.a.g.fieldOf("shape").forGetter(cxl::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cxl::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cxl::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cxl::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cxl::e)
            )
            .apply($$0, cxl::new)
   );
   private static final yx<ByteBuf, IntList> j = yv.f.a(yv.a()).a(IntArrayList::new, ArrayList::new);
   public static final yx<ByteBuf, cxl> d = yx.a(cxl.a.f, cxl::a, j, cxl::b, j, cxl::c, yv.b, cxl::d, yv.b, cxl::e, cxl::new);
   private static final wz k = wz.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<wz> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<wz> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wz.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wz.c("item.minecraft.firework_star.fade_to").b(wy.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(wz.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(wz.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wz a(xn $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wz a(int $$0) {
      cti $$1 = cti.b($$0);
      return (wz)($$1 == null ? k : wz.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cxl a(IntList $$0) {
      return new cxl(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cxl.a a() {
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

   public static enum a implements azk {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cxl.a> h = axe.a(cxl.a::b, values(), axe.a.a);
      public static final yx<ByteBuf, cxl.a> f = yv.a(h, cxl.a::b);
      public static final Codec<cxl.a> g = azk.b(cxl.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xn a() {
         return wz.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cxl.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
