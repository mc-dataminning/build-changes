import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fcg extends exv {
   private final Consumer<Optional<cpg>> a;
   private fcg.g b;
   private final Set<fcg.f> c = Sets.newHashSet();
   private esi k;
   @Nullable
   private List<ara> l;
   private final cpg m;

   public fcg(cpg $$0, Consumer<Optional<cpg>> $$1) {
      super(te.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aE_() {
      this.b = new fcg.g(this.m);
      this.e(this.b);
      evj.b $$0 = new evj().a(10).d(2);
      this.k = $$0.a(esi.a(td.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esi.a(td.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         esg var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void au_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fcg.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fcg.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fcg.d {
      private final esp<Boolean> d;

      public a(te $$1, List<ara> $$2, String $$3, cpg.a $$4) {
         super($$2, $$1);
         this.d = esp.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 45);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fcg.f {
      final te b;

      public b(te $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcg.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends etw> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends evr> b() {
         return ImmutableList.of(new evr() {
            @Override
            public evr.a q() {
               return evr.a.b;
            }

            @Override
            public void b(evt $$0) {
               $$0.a(evs.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpg.g<T>> {
      fcg.f create(te var1, List<ara> var2, String var3, T var4);
   }

   public abstract class d extends fcg.f {
      private final List<ara> a;
      protected final List<esg> b = Lists.newArrayList();

      public d(@Nullable List<ara> $$1, te $$2) {
         super($$1);
         this.a = fcg.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends etw> i() {
         return this.b;
      }

      @Override
      public List<? extends evr> b() {
         return this.b;
      }

      protected void a(erx $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fcg.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fcg.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fcg.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fcg.d {
      private final esr d;

      public e(te $$1, List<ara> $$2, String $$3, cpg.d $$4) {
         super($$2, $$1);
         this.d = new esr(fcg.this.f.h, 10, 5, 42, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.l(14737632);
               fcg.this.b(this);
            } else {
               this.d.l(16711680);
               fcg.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 44);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends eso.a<fcg.f> {
      @Nullable
      final List<ara> a;

      public f(@Nullable List<ara> $$0) {
         this.a = $$0;
      }
   }

   public class g extends eso<fcg.f> {
      public g(final cpg $$1) {
         super(fcg.this.f, fcg.this.g, fcg.this.h, 43, fcg.this.h - 32, 24);
         final Map<cpg.b, Map<cpg.e<?>, fcg.f>> $$2 = Maps.newHashMap();
         cpg.a(new cpg.c() {
            @Override
            public void b(cpg.e<cpg.a> $$0, cpg.f<cpg.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcg.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpg.e<cpg.d> $$0, cpg.f<cpg.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcg.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpg.g<T>> void a(cpg.e<T> $$0, fcg.c<T> $$1x) {
               te $$2 = te.c($$0.b());
               te $$3 = te.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               te $$6 = te.a("editGamerule.default", te.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ara> $$10;
               String $$11;
               if (fzm.a($$7)) {
                  Builder<ara> $$8 = ImmutableList.builder().add($$3.f());
                  te $$9 = te.c($$7);
                  fcg.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.f()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.f(), $$6.f());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(fcg.this.new b(te.c(((cpg.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpg.e::a)))
                     .forEach($$0xx -> this.b((fcg.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fcg.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fcg.this.b($$4.a);
         }
      }
   }
}
