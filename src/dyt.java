import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dyt {
   private static boolean a(dxq $$0) {
      return $$0.j().a(dyr.l) && $$0.u();
   }

   static CompletableFuture<dxq> a(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> b(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.J_(), $$4.m().h(), $$4.b(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> c(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> d(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> e(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), ecs.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dxq> f(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      return $$0.b().a(ecs.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dyk $$1x) {
            ebe $$2x = $$1x.w();
            if ($$2x != null) {
               ebe.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dxq> g(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> h(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      if ($$3 instanceof dyk $$6) {
         ecs.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.D(), $$4.m().i(), $$4.H_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> i(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      arp $$4 = $$0.a();
      ebq.a($$3, EnumSet.of(ebq.a.e, ebq.a.f, ebq.a.d, ebq.a.b));
      arx $$5 = new arx($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      ecs.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> j(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      ars $$4 = $$0.d();
      $$3.z();
      ((dyk)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dxq> k(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dxq> l(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      if (!$$3.x()) {
         $$0.b().a(new arx($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxq> m(dyw $$0, dyu $$1, bag<arg> $$2, dxq $$3) {
      des $$4 = $$3.f();
      arg $$5 = $$2.a($$4.g, $$4.h);
      return CompletableFuture.supplyAsync(() -> {
         dyk $$3x = (dyk)$$3;
         arp $$4x = $$0.a();
         dya $$6;
         if ($$3x instanceof dxz $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dya($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dxz($$6, false));
         }

         $$6.b($$5::r);
         $$6.D();
         $$6.c(true);
         $$6.H();
         $$6.b($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arp $$0, List<ul> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bus.a($$1, $$0, bur.r));
      }
   }
}
