import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fdk extends gvm {
   private static final wu b = wu.c("mco.reset.world.seed");
   public static final wu a = wu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int A = 210;
   private final fkz B = new fkz(this);
   private final Consumer<feg> C;
   private fhv D;
   private fea E = fea.a;
   private boolean F = true;
   private final Set<String> G = new HashSet<>();
   private final wu H;

   public fdk(Consumer<feg> $$0, wu $$1) {
      super(a);
      this.C = $$0;
      this.H = $$1;
   }

   @Override
   public void aO_() {
      this.D = new fhv(this.o, 210, 20, wu.c("mco.reset.world.seed"));
      this.D.f(32);
      this.B.a(this.k, this.o);
      fld $$0 = this.B.c(fld.d()).a(10);
      $$0.a(fkv.a(this.o, this.D, b));
      $$0.a(fht.a(fea::a).a(fea.values()).a(this.E).a(0, 0, 210, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.E = $$1x));
      $$0.a(fht.b(this.F).a(0, 0, 210, 20, wu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.F = $$1x));
      this.a($$0);
      fld $$1 = this.B.b(fld.e().a(10));
      $$1.a(fhm.a(this.H, $$0x -> this.C.accept(this.E())).a());
      $$1.a(fhm.a(wt.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.D);
   }

   private void a(fld $$0) {
      atf $$1 = ati.c();
      $$1.a();
      $$0.a(fhm.a(wu.c("selectWorld.experiments"), $$1x -> this.l.a(new fsd(this, $$1, $$0xx -> {
            this.G.clear();

            for (atc $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atg.d) {
                  this.G.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private feg E() {
      return new feg(this.D.a(), this.E, this.F, this.G);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.C.accept(null);
   }
}
