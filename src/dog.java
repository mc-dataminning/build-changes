import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dog extends dtx implements dup {
   public static final MapCodec<dog> a = b(dog::new);
   public static final ebx b = ebw.I;
   private static final Map<jc.a, fgm> e = fgj.b(dne.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, jc.a.b));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exr.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
