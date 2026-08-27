import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cwj(cwj.a e, IntList f, IntList g, boolean h, boolean i) implements cww {
   public static final cwj a = new cwj(cwj.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cwj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwj.a.g.fieldOf("shape").forGetter(cwj::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cwj::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cwj::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cwj::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cwj::e)
            )
            .apply($$0, cwj::new)
   );
   private static final yv<ByteBuf, IntList> j = yt.e.a(yt.a()).a(IntArrayList::new, ArrayList::new);
   public static final yv<ByteBuf, cwj> d = yv.a(cwj.a.f, cwj::a, j, cwj::b, j, cwj::c, yt.b, cwj::d, yt.b, cwj::e, cwj::new);
   private static final wx k = wx.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
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
      csj $$1 = csj.b($$0);
      return (wx)($$1 == null ? k : wx.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cwj a(IntList $$0) {
      return new cwj(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cwj.a a() {
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

   public static enum a implements ayz {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cwj.a> h = aww.a(cwj.a::b, values(), aww.a.a);
      public static final yv<ByteBuf, cwj.a> f = yt.a(h, cwj.a::b);
      public static final Codec<cwj.a> g = ayz.b(cwj.a::values);
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

      public static cwj.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
