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

public class fky extends fgh {
   private final Consumer<Optional<cwa>> a;
   private fky.g b;
   private final Set<fky.f> c = Sets.newHashSet();
   private fak k;
   @Nullable
   private List<avy> l;
   private final cwa m;

   public fky(cwa $$0, Consumer<Optional<cwa>> $$1) {
      super(vs.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aP_() {
      this.b = this.c(new fky.g(this.m));
      fdv.b $$0 = new fdv().a(10).d(2);
      this.k = $$0.a(fak.a(vr.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(fak.a(vr.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         fai var10000 = this.c($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void d() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void o() {
      this.k.j = this.c.isEmpty();
   }

   void a(fky.f $$0) {
      this.c.add($$0);
      this.o();
   }

   void b(fky.f $$0) {
      this.c.remove($$0);
      this.o();
   }

   public class a extends fky.d {
      private final far<Boolean> d;

      public a(vs $$1, List<avy> $$2, String $$3, cwa.a $$4) {
         super($$2, $$1);
         this.d = far.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fky.f {
      final vs b;

      public b(vs $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fky.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends fcg> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fed> a() {
         return ImmutableList.of(new fed() {
            @Override
            public fed.a s() {
               return fed.a.b;
            }

            @Override
            public void b(fef $$0) {
               $$0.a(fee.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cwa.g<T>> {
      fky.f create(vs var1, List<avy> var2, String var3, T var4);
   }

   public abstract class d extends fky.f {
      private final List<avy> a;
      protected final List<fai> b = Lists.newArrayList();

      public d(@Nullable List<avy> $$1, vs $$2) {
         super($$1);
         this.a = fky.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends fcg> l() {
         return this.b;
      }

      @Override
      public List<? extends fed> a() {
         return this.b;
      }

      protected void a(ezx $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fky.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fky.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fky.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fky.d {
      private final fat d;

      public e(vs $$1, List<avy> $$2, String $$3, cwa.d $$4) {
         super($$2, $$1);
         this.d = new fat(fky.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fky.this.b(this);
            } else {
               this.d.g(16711680);
               fky.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends faq.a<fky.f> {
      @Nullable
      final List<avy> a;

      public f(@Nullable List<avy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends faq<fky.f> {
      public g(final cwa $$1) {
         super(fky.this.f, fky.this.g, fky.this.h - 75, 43, 24);
         final Map<cwa.b, Map<cwa.e<?>, fky.f>> $$2 = Maps.newHashMap();
         cwa.a(new cwa.c() {
            @Override
            public void b(cwa.e<cwa.a> $$0, cwa.f<cwa.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fky.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cwa.e<cwa.d> $$0, cwa.f<cwa.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fky.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cwa.g<T>> void a(cwa.e<T> $$0, fky.c<T> $$1x) {
               vs $$2 = vs.c($$0.b());
               vs $$3 = vs.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vs $$6 = vs.a("editGamerule.default", vs.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<avy> $$10;
               String $$11;
               if (gje.a($$7)) {
                  Builder<avy> $$8 = ImmutableList.builder().add($$3.g());
                  vs $$9 = vs.c($$7);
                  fky.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fky.this.new b(vs.c(((cwa.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cwa.e::a)))
                     .forEach($$0xx -> this.b((fky.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fky.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fky.this.b($$4.a);
         }
      }
   }
}
