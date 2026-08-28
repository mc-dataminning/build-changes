import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyu(int f) implements cyf, cyz {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<cyu> d = ayo.a(0, 4).xmap(cyu::new, cyu::a);
   public static final zc<wp, cyu> e = zc.a(za.h, cyu::a, cyu::new);

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, cye $$3) {
      $$1.a(new bsy(bta.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      List<bsy> $$3 = List.of(new bsy(bta.E, 120000, this.f, false, false, true));
      cxr.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
