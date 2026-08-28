import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ecn extends dyt {
   public static final MapCodec<ecn> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elp.a.fieldOf("settings").forGetter(ecn::h)).apply($$0, $$0.stable(ecn::new))
   );
   private final elp d;

   public ecn(elp $$0) {
      super(new dhv($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dyu a(jt<ens> $$0, edg $$1, long $$2) {
      Stream<jr<ens>> $$3 = this.d.c().map(jv::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dyu.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dyt> b() {
      return c;
   }

   public elp h() {
      return this.d;
   }

   @Override
   public void a(arl $$0, dhe $$1, edg $$2, dys $$3) {
   }

   @Override
   public int a(dgk $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dys> a(edu $$0, edg $$1, dhe $$2, dys $$3) {
      List<dwx> $$4 = this.d.f();
      ji.a $$5 = new ji.a();
      ecs $$6 = $$3.a(ecs.a.c);
      ecs $$7 = $$3.a(ecs.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dwx $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9, false);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ecs.a $$2, dgk $$3, edg $$4) {
      List<dwx> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dwx $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dgu a(int $$0, int $$1, dgk $$2, edg $$3) {
      return new dgu($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? djo.a.m() : $$0x).toArray(dwx[]::new));
   }

   @Override
   public void a(List<String> $$0, edg $$1, ji $$2) {
   }

   @Override
   public void a(arl $$0, long $$1, edg $$2, dhm $$3, dhe $$4, dys $$5) {
   }

   @Override
   public void a(arl $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return -63;
   }
}
