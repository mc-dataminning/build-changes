import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dao(List<wv> e, List<wv> f) implements day {
   public static final dao a = new dao(List.of());
   public static final int b = 256;
   private static final xs g = xs.a.a(n.f).b(true);
   public static final Codec<dao> c = wx.a.sizeLimitedListOf(256).xmap(dao::new, dao::a);
   public static final yt<wg, dao> d = wx.b.a(yr.c(256)).a(dao::new, dao::a);

   public dao(List<wv> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wy.a($$0x.f(), g)));
   }

   public dao(List<wv> e, List<wv> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dao a(wv $$0) {
      return new dao(af.a(this.e, $$0));
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      this.f.forEach($$1);
   }

   public List<wv> a() {
      return this.e;
   }

   public List<wv> b() {
      return this.f;
   }
}
