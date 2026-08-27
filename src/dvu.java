import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dvu extends dse {
   public static final Codec<dvu> c = RecordCodecBuilder.create($$0 -> $$0.group(ees.a.fieldOf("settings").forGetter(dvu::g)).apply($$0, $$0.stable(dvu::new)));
   private final ees d;

   public dvu(ees $$0) {
      super(new dbn($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dsf a(iy<egv> $$0, dwn $$1, long $$2) {
      Stream<iw<egv>> $$3 = this.d.c().map(ja::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dsf.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dse> a() {
      return c;
   }

   public ees g() {
      return this.d;
   }

   @Override
   public void a(aqo $$0, daw $$1, dwn $$2, dsd $$3) {
   }

   @Override
   public int a(daf $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dsd> a(Executor $$0, dxb $$1, dwn $$2, daw $$3, dsd $$4) {
      List<dqh> $$5 = this.d.f();
      in.a $$6 = new in.a();
      dvz $$7 = $$4.a(dvz.a.c);
      dvz $$8 = $$4.a(dvz.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dqh $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.I_() + $$9;

            for (int $$12 = 0; $$12 < 16; $$12++) {
               for (int $$13 = 0; $$13 < 16; $$13++) {
                  $$4.a($$6.d($$12, $$11, $$13), $$10, false);
                  $$7.a($$12, $$11, $$13, $$10);
                  $$8.a($$12, $$11, $$13, $$10);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dvz.a $$2, daf $$3, dwn $$4) {
      List<dqh> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         dqh $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dap a(int $$0, int $$1, daf $$2, dwn $$3) {
      return new dap($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? ddg.a.n() : $$0x).toArray(dqh[]::new));
   }

   @Override
   public void a(List<String> $$0, dwn $$1, in $$2) {
   }

   @Override
   public void a(aqo $$0, long $$1, dwn $$2, dbe $$3, daw $$4, dsd $$5, dvv.a $$6) {
   }

   @Override
   public void a(aqo $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return -63;
   }
}
