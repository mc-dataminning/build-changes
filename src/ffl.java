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

public class ffl extends fau {
   private final Consumer<Optional<crw>> a;
   private ffl.g b;
   private final Set<ffl.f> c = Sets.newHashSet();
   private euz k;
   @Nullable
   private List<asy> l;
   private final crw m;

   public ffl(crw $$0, Consumer<Optional<crw>> $$1) {
      super(ur.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aP_() {
      this.b = new ffl.g(this.m);
      this.e(this.b);
      eyi.b $$0 = new eyi().a(10).d(2);
      this.k = $$0.a(euz.a(uq.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(euz.a(uq.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         eux var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aF_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(ffl.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(ffl.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends ffl.d {
      private final evg<Boolean> d;

      public a(ur $$1, List<asy> $$2, String $$3, crw.a $$4) {
         super($$2, $$1);
         this.d = evg.b($$4.a()).a().a($$1x -> $$1x.e().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends ffl.f {
      final ur b;

      public b(ur $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ffl.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ewu> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends eyq> b() {
         return ImmutableList.of(new eyq() {
            @Override
            public eyq.a q() {
               return eyq.a.b;
            }

            @Override
            public void b(eys $$0) {
               $$0.a(eyr.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends crw.g<T>> {
      ffl.f create(ur var1, List<asy> var2, String var3, T var4);
   }

   public abstract class d extends ffl.f {
      private final List<asy> a;
      protected final List<eux> b = Lists.newArrayList();

      public d(@Nullable List<asy> $$1, ur $$2) {
         super($$1);
         this.a = ffl.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends ewu> i() {
         return this.b;
      }

      @Override
      public List<? extends eyq> b() {
         return this.b;
      }

      protected void a(euo $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(ffl.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(ffl.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(ffl.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends ffl.d {
      private final evi d;

      public e(ur $$1, List<asy> $$2, String $$3, crw.d $$4) {
         super($$2, $$1);
         this.d = new evi(ffl.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               ffl.this.b(this);
            } else {
               this.d.m(16711680);
               ffl.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends evf.a<ffl.f> {
      @Nullable
      final List<asy> a;

      public f(@Nullable List<asy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends evf<ffl.f> {
      public g(final crw $$1) {
         super(ffl.this.f, ffl.this.g, ffl.this.h, 43, ffl.this.h - 32, 24);
         final Map<crw.b, Map<crw.e<?>, ffl.f>> $$2 = Maps.newHashMap();
         crw.a(new crw.c() {
            @Override
            public void b(crw.e<crw.a> $$0, crw.f<crw.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ffl.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(crw.e<crw.d> $$0, crw.f<crw.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ffl.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends crw.g<T>> void a(crw.e<T> $$0, ffl.c<T> $$1x) {
               ur $$2 = ur.c($$0.b());
               ur $$3 = ur.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               ur $$6 = ur.a("editGamerule.default", ur.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<asy> $$10;
               String $$11;
               if (gda.a($$7)) {
                  Builder<asy> $$8 = ImmutableList.builder().add($$3.g());
                  ur $$9 = ur.c($$7);
                  ffl.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(ffl.this.new b(ur.c(((crw.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(crw.e::a)))
                     .forEach($$0xx -> this.b((ffl.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         ffl.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            ffl.this.b($$4.a);
         }
      }
   }
}
