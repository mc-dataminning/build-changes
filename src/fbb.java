import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fbb extends gtb {
   private static final wu b = wu.c("mco.reset.world.seed");
   public static final wu a = wu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fir C = new fir(this);
   private final Consumer<fbx> D;
   private ffn E;
   private fbr F = fbr.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final wu I;

   public fbb(Consumer<fbx> $$0, wu $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new ffn(this.p, 210, 20, wu.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fiv $$0 = this.C.c(fiv.d()).a(10);
      $$0.a(fin.a(this.p, this.E, b));
      $$0.a(ffl.a(fbr::a).a(fbr.values()).a(this.F).a(0, 0, 210, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(ffl.b(this.G).a(0, 0, 210, 20, wu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fiv $$1 = this.C.b(fiv.e().a(10));
      $$1.a(ffe.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(ffe.a(wt.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void a(fiv $$0) {
      atc $$1 = atf.c();
      $$1.a();
      $$0.a(ffe.a(wu.c("selectWorld.experiments"), $$1x -> this.m.a(new fpw(this, $$1, $$0xx -> {
            this.H.clear();

            for (asz $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atd.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fbx C() {
      return new fbx(this.E.a(), this.F, this.G, this.H);
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.D.accept(null);
   }
}
