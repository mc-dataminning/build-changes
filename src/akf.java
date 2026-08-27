import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class akf {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<ayo> b = CompletableFuture.completedFuture(ayo.a);
   private final akf.a c;
   private final dw d;
   private final cvv e;
   private final avv f;
   private final enn g;
   private final akh h;
   private final aki i;

   public akf(jb.b $$0, cmn $$1, dw.a $$2, int $$3) {
      this.c = new akf.a($$0);
      this.c.a(akf.b.a);
      this.e = new cvv(this.c);
      this.f = new avv($$0);
      this.d = new dw($$2, dr.a(this.c, $$1));
      this.g = new enn(this.c);
      this.h = new akh(this.c, this.g);
      this.i = new aki($$3, this.d.a());
   }

   public aki a() {
      return this.i;
   }

   public enn b() {
      return this.g;
   }

   public cvv c() {
      return this.e;
   }

   public dw d() {
      return this.d;
   }

   public akh e() {
      return this.h;
   }

   public List<asy> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<akf> a(ate $$0, jb.b $$1, cmn $$2, dw.a $$3, int $$4, Executor $$5, Executor $$6) {
      akf $$7 = new akf($$1, $$2, $$3, $$4);
      return atk.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(akf.b.b)).thenApply($$1x -> $$7);
   }

   public void a(jb $$0) {
      this.f.a().forEach($$1 -> a($$0, (avv.a<?>)$$1));
      dmc.f();
      dcj.a();
   }

   private static <T> void a(jb $$0, avv.a<T> $$1) {
      aju<? extends ja<T>> $$2 = $$1.a();
      Map<avt<T>, List<in<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> avt.a($$2, (ajv)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends in<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements ip.a {
      private final jb a;
      akf.b b;

      a(jb $$0) {
         this.b = akf.b.b;
         this.a = $$0;
      }

      public void a(akf.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<aju<? extends ja<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<ip.b<T>> a(aju<? extends ja<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> ip.b<T> a(final ip.b<T> $$0, final ip.b<T> $$1) {
         return new ip.b.a<T>() {
            @Override
            public ip.b<T> a() {
               return switch (a.this.b) {
                  case b -> $$0;
                  case a -> $$1;
               };
            }
         };
      }
   }

   static enum b {
      a,
      b;
   }
}
