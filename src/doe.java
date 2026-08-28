import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class doe extends dtv implements dun {
   public static final MapCodec<doe> a = b(doe::new);
   public static final ebv b = ebu.I;
   private static final Map<jb.a, fgk> e = fgh.b(dnc.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, jb.a.b));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
