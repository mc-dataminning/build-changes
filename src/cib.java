import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cib extends chy implements bto<ix<cic>> {
   private static final ajr<ix<cic>> g = ajv.a(cib.class, ajt.A);
   private static final akl<cic> h = cid.a;
   public static final MapCodec<ix<cic>> e = le.l.r().fieldOf("variant");
   public static final Codec<ix<cic>> f = e.codec();

   private static ix<cic> s() {
      return le.l.g(h);
   }

   public cib(bsa<? extends cib> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(g, s());
   }

   @Override
   public void a(ajr<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(ix<cic> $$0) {
      this.ao.a(g, $$0);
   }

   public ix<cic> p() {
      return this.ao.a(g);
   }

   public static Optional<cib> a(dax $$0, io $$1, it $$2) {
      cib $$3 = new cib($$0, $$1);
      List<ix<cic>> $$4 = new ArrayList<>();
      le.l.c(awf.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.z();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cib::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ix<cic>> $$6 = ac.b($$4, $$3.ah);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.b($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(ix<cic> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cib(dax $$0, io $$1) {
      super(bsa.av, $$0, $$1);
   }

   public cib(dax $$0, io $$1, it $$2, ix<cic> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ud $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ud $$0) {
      ix<cic> $$1 = f.parse(ur.a, $$0).result().orElseGet(cib::s);
      this.b($$1);
      this.d = it.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ud $$0, ix<cic> $$1) {
      f.encodeStart(ur.a, $$1).ifSuccess($$1x -> $$0.a((ud)$$1x));
   }

   @Override
   public int A() {
      return this.p().a().a();
   }

   @Override
   public int B() {
      return this.p().a().b();
   }

   @Override
   public void b(@Nullable bru $$0) {
      if (this.dP().aa().b(dat.i)) {
         this.a(avh.sp, 1.0F, 1.0F);
         if ($$0 instanceof clw $$1 && $$1.fP()) {
            return;
         }

         this.a(ctr.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avh.sq, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public euk do() {
      return euk.a(this.c);
   }

   @Override
   public ze<abq> dl() {
      return new abr(this, this.d.d(), this.D());
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      this.a(it.a($$0.p()));
   }

   @Override
   public cto dC() {
      return new cto(ctr.pZ);
   }
}
