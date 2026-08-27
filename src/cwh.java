import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cwh(cwh.a e, IntList f, IntList g, boolean h, boolean i) implements cwu {
   public static final cwh a = new cwh(cwh.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cwh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwh.a.g.fieldOf("shape").forGetter(cwh::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cwh::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cwh::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cwh::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cwh::e)
            )
            .apply($$0, cwh::new)
   );
   private static final yv<ByteBuf, IntList> j = yt.e.a(yt.a()).a(IntArrayList::new, ArrayList::new);
   public static final yv<ByteBuf, cwh> d = yv.a(cwh.a.f, cwh::a, j, cwh::b, j, cwh::c, yt.b, cwh::d, yt.b, cwh::e, cwh::new);
   private static final wx k = wx.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      this.a($$0);
      this.b($$0);
   }

   public void a(Consumer<wx> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<wx> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wx.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wx.c("item.minecraft.firework_star.fade_to").b(ww.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(wx.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(wx.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wx a(xl $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wx a(int $$0) {
      csh $$1 = csh.b($$0);
      return (wx)($$1 == null ? k : wx.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cwh a(IntList $$0) {
      return new cwh(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cwh.a a() {
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

   public static enum a implements ayx {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cwh.a> h = awv.a(cwh.a::b, values(), awv.a.a);
      public static final yv<ByteBuf, cwh.a> f = yt.a(h, cwh.a::b);
      public static final Codec<cwh.a> g = ayx.b(cwh.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xl a() {
         return wx.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cwh.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
