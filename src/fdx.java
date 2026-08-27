import java.util.Map;
import java.util.Optional;

public interface fdx {
   Map<Optional<afv<dvp>>, fdx> a = Map.of(Optional.of(dvq.b), ($$0, $$1) -> {
      dhy $$2 = $$1.d().a();
      ip $$3 = $$1.a();
      ic<crx> $$4 = $$3.b(jz.aq);
      ic<dwg> $$5 = $$3.b(jz.aC);
      ic<dve> $$6 = $$3.b(jz.az);
      return new eya($$0, $$1x -> $$0.l().a(a($$1x)), $$2 instanceof dlf ? ((dlf)$$2).g() : dud.a($$4, $$5, $$6));
   }, Optional.of(dvq.e), ($$0, $$1) -> new exz($$0, $$1, $$1x -> $$0.l().a(a($$1x))));

   ezd createEditScreen(fds var1, fea var2);

   private static fea.a a(dud $$0) {
      return ($$1, $$2) -> {
         dhy $$3 = new dlf($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fea.a a(ib<crx> $$0) {
      return ($$1, $$2) -> {
         io<dlp> $$3 = $$1.d(jz.ax);
         ib<dlp> $$4 = $$3.f(dlp.c);
         csb $$5 = new csi($$0);
         dhy $$6 = new dln($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
