import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fcq extends fbi {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fsv.a l;

   public fcq(dga $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.l = fsv.a(this.f.aO(), this.a);
   }

   @Override
   protected void b(eub $$0, dgw $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dcn;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(eub $$0, dgw $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dcn;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gdl $$3 = fqw.a(this.a);
         eno $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, gay.d);
      }
   }

   @Override
   protected Vector3f l() {
      return k;
   }
}
