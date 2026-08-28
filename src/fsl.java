import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class fsl implements mo {
   private final mq.a d;
   private final mq.a e;
   private final mq.a f;

   public fsl(mq $$0) {
      this.d = $$0.a(mq.b.b, "blockstates");
      this.e = $$0.a(mq.b.b, "items");
      this.f = $$0.a(mq.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      fsl.b $$1 = new fsl.b();
      fsl.a $$2 = new fsl.a();
      fsl.c $$3 = new fsl.c();
      new fsh($$2, $$1, $$3).a();
      new fsj($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<fsn> {
      private final Map<dno, fsn> a = new HashMap<>();

      public void a(fsn $$0) {
         dno $$1 = $$0.a();
         fsn $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jg.c<dno>> $$0 = mh.e.c().filter($$0x -> true);
         List<alr> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         Map<dno, gsy> $$2 = Maps.transformValues(this.a, fsn::b);
         Function<dno, Path> $$3 = $$1x -> $$1.a($$1x.p().h().a());
         return mo.a($$0, gsy.a, $$3, $$2);
      }
   }

   static class b implements fsk {
      private final Map<dag, hhb> a = new HashMap<>();
      private final Map<dag, dag> b = new HashMap<>();

      @Override
      public void a(dag $$0, hhf.b $$1) {
         this.a($$0, new hhb($$1, hhb.a.a));
      }

      private void a(dag $$0, hhb $$1) {
         hhb $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(dag $$0, dag $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mh.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cys $$1 && !this.a.containsKey($$1)) {
                  alr $$2 = fsx.a($$1.c());
                  this.a($$1, fsv.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hhb $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<alr> $$0 = mh.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         return mo.a($$0, hhb.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<alr, fsw> {
      private final Map<alr, fsw> a = new HashMap<>();

      public void a(alr $$0, fsw $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         return mo.a($$0, Supplier::get, $$1::a, this.a);
      }
   }
}
