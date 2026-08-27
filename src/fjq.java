import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fjq extends fii {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gag.a l;

   public fjq(dlr $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.l = gag.a(this.f.aR(), this.a);
   }

   @Override
   protected void b(fav $$0, dnb $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dhw;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fav $$0, dnb $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dhw;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         glf $$3 = fyh.a(this.a);
         euf $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, git.d);
      }
   }

   @Override
   protected Vector3f o() {
      return k;
   }
}
