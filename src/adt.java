import java.util.BitSet;
import javax.annotation.Nullable;

public class adt implements zp<ace> {
   public static final zg<wf, adt> a = zp.a(adt::a, adt::new);
   private final int b;
   private final int c;
   private final adu d;

   public adt(deh $$0, eqz $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.g;
      this.c = $$0.h;
      this.d = new adu($$0, $$1, $$2, $$3);
   }

   private adt(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adu($$0, this.b, this.c);
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zr<adt> a() {
      return agt.N;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adu f() {
      return this.d;
   }
}
