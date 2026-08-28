import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cyi(cyi.a e, IntList f, IntList g, boolean h, boolean i) implements cyw {
   public static final cyi a = new cyi(cyi.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cyi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyi.a.g.fieldOf("shape").forGetter(cyi::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cyi::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cyi::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cyi::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cyi::e)
            )
            .apply($$0, cyi::new)
   );
   private static final zb<ByteBuf, IntList> j = yz.f.a(yz.a()).a(IntArrayList::new, ArrayList::new);
   public static final zb<ByteBuf, cyi> d = zb.a(cyi.a.f, cyi::a, j, cyi::b, j, cyi::c, yz.b, cyi::d, yz.b, cyi::e, cyi::new);
   private static final xd k = xd.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xd> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xd> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xd.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xd.c("item.minecraft.firework_star.fade_to").b(xc.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xd.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xd.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xd a(xr $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xd a(int $$0) {
      cuj $$1 = cuj.b($$0);
      return (xd)($$1 == null ? k : xd.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cyi a(IntList $$0) {
      return new cyi(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cyi.a a() {
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

   public static enum a implements azz {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cyi.a> h = axu.a(cyi.a::b, values(), axu.a.a);
      public static final zb<ByteBuf, cyi.a> f = yz.a(h, cyi.a::b);
      public static final Codec<cyi.a> g = azz.b(cyi.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xr a() {
         return xd.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cyi.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
