import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cxd(cxd.a e, IntList f, IntList g, boolean h, boolean i) implements cxq {
   public static final cxd a = new cxd(cxd.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cxd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxd.a.g.fieldOf("shape").forGetter(cxd::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cxd::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cxd::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cxd::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cxd::e)
            )
            .apply($$0, cxd::new)
   );
   private static final zj<ByteBuf, IntList> j = zh.f.a(zh.a()).a(IntArrayList::new, ArrayList::new);
   public static final zj<ByteBuf, cxd> d = zj.a(cxd.a.f, cxd::a, j, cxd::b, j, cxd::c, zh.b, cxd::d, zh.b, cxd::e, cxd::new);
   private static final xl k = xl.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xl> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xl> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xl.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xl.c("item.minecraft.firework_star.fade_to").b(xk.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xl.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xl.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xl a(xz $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xl a(int $$0) {
      ctd $$1 = ctd.b($$0);
      return (xl)($$1 == null ? k : xl.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cxd a(IntList $$0) {
      return new cxd(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cxd.a a() {
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

   public static enum a implements azp {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cxd.a> h = axl.a(cxd.a::b, values(), axl.a.a);
      public static final zj<ByteBuf, cxd.a> f = zh.a(h, cxd.a::b);
      public static final Codec<cxd.a> g = azp.b(cxd.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xz a() {
         return xl.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cxd.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
