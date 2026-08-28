import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class csz extends csd {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dej z;
   @Nullable
   private dam<dbc> A;
   private final List<dam<dbc>> B;

   public csz(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public csz(int $$0, cnw $$1, crm $$2) {
      super(csi.v, $$0, $$1, $$2);
      this.z = $$1.k.dS();
      this.B = this.z.r().a(daq.g);
   }

   @Override
   protected cse l() {
      return cse.a()
         .a(0, 8, 48, $$0 -> this.B.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.B.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.B.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.a(dho.ob);
   }

   @Override
   protected boolean a(cnx $$0, boolean $$1) {
      return this.A != null && this.A.b().a(this.p(), this.z);
   }

   @Override
   protected void a(cnx $$0, cvs $$1) {
      $$1.a($$0.dS(), $$0, $$1.K());
      this.t.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cvs> n() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dbd p() {
      return new dbd(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cvs $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      dbd $$0 = this.p();
      List<dam<dbc>> $$1 = this.z.r().b(daq.g, $$0, this.z);
      if ($$1.isEmpty()) {
         this.t.a(0, cvs.k);
      } else {
         dam<dbc> $$2 = $$1.get(0);
         cvs $$3 = $$2.b().a($$0, this.z.G_());
         if ($$3.a(this.z.J())) {
            this.A = $$2;
            this.t.a($$2);
            this.t.a(0, $$3);
         }
      }
   }

   @Override
   public int d(cvs $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(dbc $$0, cvs $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cvs $$0, csw $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cvs $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cvs $$0) {
      return this.B.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
