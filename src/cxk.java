import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cxk(cxk.a e, IntList f, IntList g, boolean h, boolean i) implements cxx {
   public static final cxk a = new cxk(cxk.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cxk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxk.a.g.fieldOf("shape").forGetter(cxk::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cxk::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cxk::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cxk::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cxk::e)
            )
            .apply($$0, cxk::new)
   );
   private static final zn<ByteBuf, IntList> j = zl.f.a(zl.a()).a(IntArrayList::new, ArrayList::new);
   public static final zn<ByteBuf, cxk> d = zn.a(cxk.a.f, cxk::a, j, cxk::b, j, cxk::c, zl.b, cxk::d, zl.b, cxk::e, cxk::new);
   private static final xp k = xp.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cum.b $$0, Consumer<xp> $$1, cwk $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xp> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xp> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xp.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xp.c("item.minecraft.firework_star.fade_to").b(xo.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xp.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xp.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xp a(yd $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xp a(int $$0) {
      ctk $$1 = ctk.b($$0);
      return (xp)($$1 == null ? k : xp.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cxk a(IntList $$0) {
      return new cxk(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cxk.a a() {
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

   public static enum a implements azu {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cxk.a> h = axp.a(cxk.a::b, values(), axp.a.a);
      public static final zn<ByteBuf, cxk.a> f = zl.a(h, cxk.a::b);
      public static final Codec<cxk.a> g = azu.b(cxk.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public yd a() {
         return xp.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cxk.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
