import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bqs {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> a(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bqg(0.8F)),
         Pair.of(0, bok.a()),
         Pair.of(0, new bos(45, 90)),
         Pair.of(0, new bqu()),
         Pair.of(0, bqv.a()),
         Pair.of(0, bpf.a()),
         Pair.of(0, bpp.a()),
         Pair.of(0, bqp.a($$0.b(), bux.c)),
         Pair.of(0, bqp.a($$0.c(), bux.d)),
         Pair.of(1, new bow()),
         Pair.of(2, boz.a()),
         Pair.of(3, new bor($$1)),
         new Pair[]{
            Pair.of(5, bog.a($$1, false, 4)),
            Pair.of(6, bnf.a($$0.c(), bux.c, bux.d, true, Optional.empty())),
            Pair.of(7, new boe($$1)),
            Pair.of(8, bqy.a($$1)),
            Pair.of(10, bnf.a($$0x -> $$0x.a(bxa.n), bux.b, false, Optional.of((byte)14))),
            Pair.of(10, bnf.a($$0x -> $$0x.a(bxa.o), bux.e, true, Optional.of((byte)14))),
            Pair.of(10, bni.a()),
            Pair.of(10, bpg.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> b(ceh $$0, float $$1) {
      bqx $$2;
      if ($$0 == ceh.g) {
         $$2 = new bqw();
      } else {
         $$2 = new bqx();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bpj(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bqd.a(bux.c, 0.4F, 4), 2),
                  Pair.of(bqe.a(bux.c, 0.4F, 1, 10), 5),
                  Pair.of(bqf.a(bux.f, $$1, 1, 6, bux.c), 5),
                  Pair.of(new boh(), $$0 == ceh.g ? 2 : 5),
                  Pair.of(new bqo(), $$0 == ceh.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bpu(400, 1600)),
         Pair.of(10, bpo.a(blj.bv, 4)),
         Pair.of(2, bps.a(bux.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bob(100)),
         Pair.of(99, bqn.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bow(80, 120)),
         a(),
         Pair.of(5, boy.a()),
         Pair.of(
            5,
            new bpj(
               ImmutableMap.of(bux.i, buy.b),
               ImmutableList.of(
                  Pair.of(boj.a(blj.bg, 8, bux.q, $$0, 2), 2),
                  Pair.of(boj.a(blj.n, 8, bux.q, $$0, 2), 1),
                  Pair.of(bqq.a($$0), 1),
                  Pair.of(bpt.a($$0, 2), 1),
                  Pair.of(new bol($$0), 2),
                  Pair.of(new bnw(20, 40), 2)
               )
            )
         ),
         Pair.of(99, bqn.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> c(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bps.a(bux.b, $$1, 1, 150, 1200)),
         Pair.of(3, bqp.a($$0x -> $$0x.a(bxa.n), bux.b)),
         Pair.of(3, new bpw()),
         Pair.of(
            5,
            new bpj(
               ImmutableMap.of(bux.b, buy.b),
               ImmutableList.of(Pair.of(bpk.a($$1), 1), Pair.of(boi.a($$1), 4), Pair.of(bod.a($$1, 4), 2), Pair.of(new bnw(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, bqn.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> d(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bqi.a(ImmutableList.of(Pair.of(bqd.a(bux.e, 0.4F, 40), 2), Pair.of(bpx.a(), 2)))),
         Pair.of(10, new bpu(400, 1600)),
         Pair.of(10, bpo.a(blj.bv, 4)),
         Pair.of(2, bps.a(bux.e, $$1, 6, 100, 200)),
         Pair.of(3, new bob(100)),
         Pair.of(3, bqp.a($$0x -> $$0x.a(bxa.o), bux.e)),
         Pair.of(3, new boa(ImmutableMap.of(), ImmutableSet.of(bux.q), boa.a.a, boa.b.a, ImmutableList.of(Pair.of(new bqh(), 1)))),
         a(),
         Pair.of(99, bqn.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> e(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bpj(
               ImmutableList.of(
                  Pair.of(boj.a(blj.bg, 8, bux.q, $$1, 2), 2),
                  Pair.of(boj.a(blj.bg, 8, bla::Y_, bla::Y_, bux.r, $$1, 2), 1),
                  Pair.of(boj.a(blj.n, 8, bux.q, $$1, 2), 1),
                  Pair.of(bqq.a($$1), 1),
                  Pair.of(bpt.a($$1, 2), 1),
                  Pair.of(new bol($$1), 1),
                  Pair.of(new bnw(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bob(100)),
         Pair.of(3, bpo.a(blj.bv, 4)),
         Pair.of(3, new bpu(400, 1600)),
         Pair.of(3, new boa(ImmutableMap.of(), ImmutableSet.of(bux.q), boa.a.a, boa.b.a, ImmutableList.of(Pair.of(new bqh(), 1)))),
         Pair.of(3, new boa(ImmutableMap.of(), ImmutableSet.of(bux.r), boa.a.a, boa.b.a, ImmutableList.of(Pair.of(new bqt(), 1)))),
         a(),
         Pair.of(99, bqn.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> f(ceh $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, bqr.a()), Pair.of(1, bpq.b(bux.A, $$2, 6, false)), Pair.of(1, bpq.b(bux.y, $$2, 6, false)), Pair.of(3, bqq.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> g(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bpi.a()),
         Pair.of(0, bqi.a(ImmutableList.of(Pair.of(bps.a(bux.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(bqq.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bph.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> h(ceh $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bqz.a(bqz.a(bqs::b), bqi.a(ImmutableList.of(Pair.of(bov.a($$1), 5), Pair.of(bqq.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bnq(600, 600)),
         Pair.of(2, bqz.a(bqz.a(bqs::a), bom.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bph.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bnn<? super cee>>> i(ceh $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bpn.a(15, 3)), Pair.of(1, bom.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bnn<blv>> a() {
      return Pair.of(
         5,
         new bpj(
            ImmutableList.of(
               Pair.of(bpl.a(blj.n, 8.0F), 8),
               Pair.of(bpl.a(blj.bg, 8.0F), 2),
               Pair.of(bpl.a(blj.bv, 8.0F), 2),
               Pair.of(bpl.a(bly.b, 8.0F), 1),
               Pair.of(bpl.a(bly.f, 8.0F), 1),
               Pair.of(bpl.a(bly.d, 8.0F), 1),
               Pair.of(bpl.a(bly.e, 8.0F), 1),
               Pair.of(bpl.a(bly.g, 8.0F), 1),
               Pair.of(bpl.a(bly.a, 8.0F), 1),
               Pair.of(new bnw(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bnn<blv>> b() {
      return Pair.of(5, new bpj(ImmutableList.of(Pair.of(bpl.a(blj.bg, 8.0F), 2), Pair.of(bpl.a(blj.bv, 8.0F), 2), Pair.of(new bnw(30, 60), 8))));
   }

   private static boolean a(amp $$0, blv $$1) {
      cfz $$2 = $$0.c($$1.dm());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(amp $$0, blv $$1) {
      cfz $$2 = $$0.c($$1.dm());
      return $$2 != null && $$2.e();
   }
}
