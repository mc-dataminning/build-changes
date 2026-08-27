import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fhu extends fgm {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fyh.a l;

   public fhu(dkg $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.l = fyh.a(this.f.aQ(), this.a);
   }

   @Override
   protected void b(ezb $$0, dlj $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dgm;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(ezb $$0, dlj $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dgm;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gje $$3 = fwi.a(this.a);
         esl $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, ggs.d);
      }
   }

   @Override
   protected Vector3f o() {
      return k;
   }
}
