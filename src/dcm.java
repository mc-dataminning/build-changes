import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dcm(dcm.a e, IntList f, IntList g, boolean h, boolean i) implements ddd {
   public static final dcm a = new dcm(dcm.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dcm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcm.a.g.fieldOf("shape").forGetter(dcm::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dcm::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dcm::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dcm::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dcm::e)
            )
            .apply($$0, dcm::new)
   );
   private static final yy<ByteBuf, IntList> j = yw.g.a(yw.a()).a(IntArrayList::new, ArrayList::new);
   public static final yy<ByteBuf, dcm> d = yy.a(dcm.a.f, dcm::a, j, dcm::b, j, dcm::c, yw.b, dcm::d, yw.b, dcm::e, dcm::new);
   private static final xa k = xa.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      $$1.accept(this.e.a().a(o.h));
      this.a($$1);
   }

   public void a(Consumer<xa> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xa.i().a(o.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xa.c("item.minecraft.firework_star.fade_to").b(wz.v).a(o.h), this.g));
      }

      if (this.h) {
         $$0.accept(xa.c("item.minecraft.firework_star.trail").a(o.h));
      }

      if (this.i) {
         $$0.accept(xa.c("item.minecraft.firework_star.flicker").a(o.h));
      }
   }

   private static xa a(xo $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xa a(int $$0) {
      cyw $$1 = cyw.b($$0);
      return (xa)($$1 == null ? k : xa.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dcm a(IntList $$0) {
      return new dcm(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dcm.a a() {
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

   public static enum a implements bam {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dcm.a> h = aye.a(dcm.a::b, values(), aye.a.a);
      public static final yy<ByteBuf, dcm.a> f = yw.a(h, dcm.a::b);
      public static final Codec<dcm.a> g = bam.b(dcm.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xo a() {
         return xa.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dcm.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
