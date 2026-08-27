import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class brl {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> a(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bqz(0.8F)),
         Pair.of(0, bpd.a()),
         Pair.of(0, new bpl(45, 90)),
         Pair.of(0, new brn()),
         Pair.of(0, bro.a()),
         Pair.of(0, bpy.a()),
         Pair.of(0, bqi.a()),
         Pair.of(0, bri.a($$0.b(), bvq.c)),
         Pair.of(0, bri.a($$0.c(), bvq.d)),
         Pair.of(1, new bpp()),
         Pair.of(2, bps.a()),
         Pair.of(3, new bpk($$1)),
         new Pair[]{
            Pair.of(5, boz.a($$1, false, 4)),
            Pair.of(6, bny.a($$0.c(), bvq.c, bvq.d, true, Optional.empty())),
            Pair.of(7, new box($$1)),
            Pair.of(8, brr.a($$1)),
            Pair.of(10, bny.a($$0x -> $$0x.a(bxu.n), bvq.b, false, Optional.of((byte)14))),
            Pair.of(10, bny.a($$0x -> $$0x.a(bxu.o), bvq.e, true, Optional.of((byte)14))),
            Pair.of(10, bob.a()),
            Pair.of(10, bpz.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> b(cfg $$0, float $$1) {
      brq $$2;
      if ($$0 == cfg.g) {
         $$2 = new brp();
      } else {
         $$2 = new brq();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bqc(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bqw.a(bvq.c, 0.4F, 4), 2),
                  Pair.of(bqx.a(bvq.c, 0.4F, 1, 10), 5),
                  Pair.of(bqy.a(bvq.f, $$1, 1, 6, bvq.c), 5),
                  Pair.of(new bpa(), $$0 == cfg.g ? 2 : 5),
                  Pair.of(new brh(), $$0 == cfg.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bqn(400, 1600)),
         Pair.of(10, bqh.a(bmc.bw, 4)),
         Pair.of(2, bql.a(bvq.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bou(100)),
         Pair.of(99, brg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bpp(80, 120)),
         a(),
         Pair.of(5, bpr.a()),
         Pair.of(
            5,
            new bqc(
               ImmutableMap.of(bvq.i, bvr.b),
               ImmutableList.of(
                  Pair.of(bpc.a(bmc.bh, 8, bvq.q, $$0, 2), 2),
                  Pair.of(bpc.a(bmc.o, 8, bvq.q, $$0, 2), 1),
                  Pair.of(brj.a($$0), 1),
                  Pair.of(bqm.a($$0, 2), 1),
                  Pair.of(new bpe($$0), 2),
                  Pair.of(new bop(20, 40), 2)
               )
            )
         ),
         Pair.of(99, brg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> c(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bql.a(bvq.b, $$1, 1, 150, 1200)),
         Pair.of(3, bri.a($$0x -> $$0x.a(bxu.n), bvq.b)),
         Pair.of(3, new bqp()),
         Pair.of(
            5,
            new bqc(
               ImmutableMap.of(bvq.b, bvr.b),
               ImmutableList.of(Pair.of(bqd.a($$1), 1), Pair.of(bpb.a($$1), 4), Pair.of(bow.a($$1, 4), 2), Pair.of(new bop(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, brg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> d(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, brb.a(ImmutableList.of(Pair.of(bqw.a(bvq.e, 0.4F, 40), 2), Pair.of(bqq.a(), 2)))),
         Pair.of(10, new bqn(400, 1600)),
         Pair.of(10, bqh.a(bmc.bw, 4)),
         Pair.of(2, bql.a(bvq.e, $$1, 6, 100, 200)),
         Pair.of(3, new bou(100)),
         Pair.of(3, bri.a($$0x -> $$0x.a(bxu.o), bvq.e)),
         Pair.of(3, new bot(ImmutableMap.of(), ImmutableSet.of(bvq.q), bot.a.a, bot.b.a, ImmutableList.of(Pair.of(new bra(), 1)))),
         a(),
         Pair.of(99, brg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> e(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bqc(
               ImmutableList.of(
                  Pair.of(bpc.a(bmc.bh, 8, bvq.q, $$1, 2), 2),
                  Pair.of(bpc.a(bmc.bh, 8, blr::Y_, blr::Y_, bvq.r, $$1, 2), 1),
                  Pair.of(bpc.a(bmc.o, 8, bvq.q, $$1, 2), 1),
                  Pair.of(brj.a($$1), 1),
                  Pair.of(bqm.a($$1, 2), 1),
                  Pair.of(new bpe($$1), 1),
                  Pair.of(new bop(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bou(100)),
         Pair.of(3, bqh.a(bmc.bw, 4)),
         Pair.of(3, new bqn(400, 1600)),
         Pair.of(3, new bot(ImmutableMap.of(), ImmutableSet.of(bvq.q), bot.a.a, bot.b.a, ImmutableList.of(Pair.of(new bra(), 1)))),
         Pair.of(3, new bot(ImmutableMap.of(), ImmutableSet.of(bvq.r), bot.a.a, bot.b.a, ImmutableList.of(Pair.of(new brm(), 1)))),
         a(),
         Pair.of(99, brg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> f(cfg $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, brk.a()), Pair.of(1, bqj.b(bvq.A, $$2, 6, false)), Pair.of(1, bqj.b(bvq.y, $$2, 6, false)), Pair.of(3, brj.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> g(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bqb.a()),
         Pair.of(0, brb.a(ImmutableList.of(Pair.of(bql.a(bvq.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(brj.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bqa.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> h(cfg $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, brs.a(brs.a(brl::b), brb.a(ImmutableList.of(Pair.of(bpo.a($$1), 5), Pair.of(brj.a($$1 * 1.1F), 2))))),
         Pair.of(0, new boj(600, 600)),
         Pair.of(2, brs.a(brs.a(brl::a), bpf.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bqa.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bog<? super cfd>>> i(cfg $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bqg.a(15, 3)), Pair.of(1, bpf.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bog<bmo>> a() {
      return Pair.of(
         5,
         new bqc(
            ImmutableList.of(
               Pair.of(bqe.a(bmc.o, 8.0F), 8),
               Pair.of(bqe.a(bmc.bh, 8.0F), 2),
               Pair.of(bqe.a(bmc.bw, 8.0F), 2),
               Pair.of(bqe.a(bmr.b, 8.0F), 1),
               Pair.of(bqe.a(bmr.f, 8.0F), 1),
               Pair.of(bqe.a(bmr.d, 8.0F), 1),
               Pair.of(bqe.a(bmr.e, 8.0F), 1),
               Pair.of(bqe.a(bmr.g, 8.0F), 1),
               Pair.of(bqe.a(bmr.a, 8.0F), 1),
               Pair.of(new bop(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bog<bmo>> b() {
      return Pair.of(5, new bqc(ImmutableList.of(Pair.of(bqe.a(bmc.bh, 8.0F), 2), Pair.of(bqe.a(bmc.bw, 8.0F), 2), Pair.of(new bop(30, 60), 8))));
   }

   private static boolean a(ane $$0, bmo $$1) {
      cgy $$2 = $$0.d($$1.dl());
      return $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }

   private static boolean b(ane $$0, bmo $$1) {
      cgy $$2 = $$0.d($$1.dl());
      return $$2 != null && $$2.e();
   }
}
