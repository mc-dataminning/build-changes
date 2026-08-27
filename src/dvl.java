import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dvl extends drv {
   public static final Codec<dvl> c = RecordCodecBuilder.create($$0 -> $$0.group(eej.a.fieldOf("settings").forGetter(dvl::g)).apply($$0, $$0.stable(dvl::new)));
   private final eej d;

   public dvl(eej $$0) {
      super(new dbe($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public drw a(ix<egm> $$0, dwe $$1, long $$2) {
      Stream<iv<egm>> $$3 = this.d.c().map(iz::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return drw.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends drv> a() {
      return c;
   }

   public eej g() {
      return this.d;
   }

   @Override
   public void a(aql $$0, dan $$1, dwe $$2, dru $$3) {
   }

   @Override
   public int a(czw $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dru> a(Executor $$0, dws $$1, dwe $$2, dan $$3, dru $$4) {
      List<dpy> $$5 = this.d.f();
      im.a $$6 = new im.a();
      dvq $$7 = $$4.a(dvq.a.c);
      dvq $$8 = $$4.a(dvq.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dpy $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dvq.a $$2, czw $$3, dwe $$4) {
      List<dpy> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         dpy $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dag a(int $$0, int $$1, czw $$2, dwe $$3) {
      return new dag($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dcx.a.n() : $$0x).toArray(dpy[]::new));
   }

   @Override
   public void a(List<String> $$0, dwe $$1, im $$2) {
   }

   @Override
   public void a(aql $$0, long $$1, dwe $$2, dav $$3, dan $$4, dru $$5, dvm.a $$6) {
   }

   @Override
   public void a(aql $$0) {
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
