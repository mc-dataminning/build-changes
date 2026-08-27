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

public class fjv extends ffe {
   private final Consumer<Optional<cvj>> a;
   private fjv.g b;
   private final Set<fjv.f> c = Sets.newHashSet();
   private ezh k;
   @Nullable
   private List<avt> l;
   private final cvj m;

   public fjv(cvj $$0, Consumer<Optional<cvj>> $$1) {
      super(vq.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aQ_() {
      this.b = this.d(new fjv.g(this.m));
      fcs.b $$0 = new fcs().a(10).d(2);
      this.k = $$0.a(ezh.a(vp.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(ezh.a(vp.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void d() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void o() {
      this.k.j = this.c.isEmpty();
   }

   void a(fjv.f $$0) {
      this.c.add($$0);
      this.o();
   }

   void b(fjv.f $$0) {
      this.c.remove($$0);
      this.o();
   }

   public class a extends fjv.d {
      private final ezo<Boolean> d;

      public a(vq $$1, List<avt> $$2, String $$3, cvj.a $$4) {
         super($$2, $$1);
         this.d = ezo.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fjv.f {
      final vq b;

      public b(vq $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fjv.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends fbd> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fda> a() {
         return ImmutableList.of(new fda() {
            @Override
            public fda.a s() {
               return fda.a.b;
            }

            @Override
            public void b(fdc $$0) {
               $$0.a(fdb.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cvj.g<T>> {
      fjv.f create(vq var1, List<avt> var2, String var3, T var4);
   }

   public abstract class d extends fjv.f {
      private final List<avt> a;
      protected final List<ezf> b = Lists.newArrayList();

      public d(@Nullable List<avt> $$1, vq $$2) {
         super($$1);
         this.a = fjv.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends fbd> l() {
         return this.b;
      }

      @Override
      public List<? extends fda> a() {
         return this.b;
      }

      protected void a(eyu $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fjv.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fjv.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fjv.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fjv.d {
      private final ezq d;

      public e(vq $$1, List<avt> $$2, String $$3, cvj.d $$4) {
         super($$2, $$1);
         this.d = new ezq(fjv.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fjv.this.b(this);
            } else {
               this.d.g(16711680);
               fjv.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends ezn.a<fjv.f> {
      @Nullable
      final List<avt> a;

      public f(@Nullable List<avt> $$0) {
         this.a = $$0;
      }
   }

   public class g extends ezn<fjv.f> {
      public g(final cvj $$1) {
         super(fjv.this.f, fjv.this.g, fjv.this.h - 75, 43, 24);
         final Map<cvj.b, Map<cvj.e<?>, fjv.f>> $$2 = Maps.newHashMap();
         cvj.a(new cvj.c() {
            @Override
            public void b(cvj.e<cvj.a> $$0, cvj.f<cvj.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fjv.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cvj.e<cvj.d> $$0, cvj.f<cvj.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fjv.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cvj.g<T>> void a(cvj.e<T> $$0, fjv.c<T> $$1x) {
               vq $$2 = vq.c($$0.b());
               vq $$3 = vq.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vq $$6 = vq.a("editGamerule.default", vq.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<avt> $$10;
               String $$11;
               if (ghy.a($$7)) {
                  Builder<avt> $$8 = ImmutableList.builder().add($$3.g());
                  vq $$9 = vq.c($$7);
                  fjv.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
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
                  this.b(fjv.this.new b(vq.c(((cvj.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cvj.e::a)))
                     .forEach($$0xx -> this.b((fjv.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fjv.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fjv.this.b($$4.a);
         }
      }
   }
}
