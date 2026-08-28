import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dbg(dbg.a e, IntList f, IntList g, boolean h, boolean i) implements dbx {
   public static final dbg a = new dbg(dbg.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dbg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbg.a.g.fieldOf("shape").forGetter(dbg::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dbg::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dbg::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dbg::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dbg::e)
            )
            .apply($$0, dbg::new)
   );
   private static final yu<ByteBuf, IntList> j = ys.g.a(ys.a()).a(IntArrayList::new, ArrayList::new);
   public static final yu<ByteBuf, dbg> d = yu.a(dbg.a.f, dbg::a, j, dbg::b, j, dbg::c, ys.b, dbg::d, ys.b, dbg::e, dbg::new);
   private static final ww k = ww.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<ww> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<ww> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(ww.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(ww.c("item.minecraft.firework_star.fade_to").b(wv.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(ww.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(ww.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static ww a(xk $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static ww a(int $$0) {
      cxq $$1 = cxq.b($$0);
      return (ww)($$1 == null ? k : ww.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dbg a(IntList $$0) {
      return new dbg(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dbg.a a() {
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

      private static final IntFunction<dbg.a> h = aya.a(dbg.a::b, values(), aya.a.a);
      public static final yu<ByteBuf, dbg.a> f = ys.a(h, dbg.a::b);
      public static final Codec<dbg.a> g = bai.b(dbg.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xk a() {
         return ww.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dbg.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
