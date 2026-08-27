import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public final class fkw {
   @Nullable
   private final String a;
   private final Vector3f b;
   private final Vector3f c;
   private final fkx d;
   private final boolean e;
   private final fld f;
   private final fld g;
   private final Set<ib> h;

   protected fkw(
      @Nullable String $$0,
      float $$1,
      float $$2,
      float $$3,
      float $$4,
      float $$5,
      float $$6,
      float $$7,
      float $$8,
      fkx $$9,
      boolean $$10,
      float $$11,
      float $$12,
      Set<ib> $$13
   ) {
      this.a = $$0;
      this.f = new fld($$1, $$2);
      this.b = new Vector3f($$3, $$4, $$5);
      this.c = new Vector3f($$6, $$7, $$8);
      this.d = $$9;
      this.e = $$10;
      this.g = new fld($$11, $$12);
      this.h = $$13;
   }

   public fkt.a a(int $$0, int $$1) {
      return new fkt.a(
         (int)this.f.a(),
         (int)this.f.b(),
         this.b.x(),
         this.b.y(),
         this.b.z(),
         this.c.x(),
         this.c.y(),
         this.c.z(),
         this.d.b,
         this.d.c,
         this.d.d,
         this.e,
         (float)$$0 * this.g.a(),
         (float)$$1 * this.g.b(),
         this.h
      );
   }
}
