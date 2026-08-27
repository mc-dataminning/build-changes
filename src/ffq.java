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

public class ffq extends faz {
   private final Consumer<Optional<csb>> a;
   private ffq.g b;
   private final Set<ffq.f> c = Sets.newHashSet();
   private eve k;
   @Nullable
   private List<atc> l;
   private final csb m;

   public ffq(csb $$0, Consumer<Optional<csb>> $$1) {
      super(uv.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aQ_() {
      this.b = new ffq.g(this.m);
      this.e(this.b);
      eyn.b $$0 = new eyn().a(10).d(2);
      this.k = $$0.a(eve.a(uu.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(eve.a(uu.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         evc var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aG_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(ffq.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(ffq.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends ffq.d {
      private final evl<Boolean> d;

      public a(uv $$1, List<atc> $$2, String $$3, csb.a $$4) {
         super($$2, $$1);
         this.d = evl.b($$4.a()).a().a($$1x -> $$1x.e().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends ffq.f {
      final uv b;

      public b(uv $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ffq.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ewz> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends eyv> b() {
         return ImmutableList.of(new eyv() {
            @Override
            public eyv.a q() {
               return eyv.a.b;
            }

            @Override
            public void b(eyx $$0) {
               $$0.a(eyw.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends csb.g<T>> {
      ffq.f create(uv var1, List<atc> var2, String var3, T var4);
   }

   public abstract class d extends ffq.f {
      private final List<atc> a;
      protected final List<evc> b = Lists.newArrayList();

      public d(@Nullable List<atc> $$1, uv $$2) {
         super($$1);
         this.a = ffq.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends ewz> i() {
         return this.b;
      }

      @Override
      public List<? extends eyv> b() {
         return this.b;
      }

      protected void a(eut $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(ffq.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(ffq.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(ffq.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends ffq.d {
      private final evn d;

      public e(uv $$1, List<atc> $$2, String $$3, csb.d $$4) {
         super($$2, $$1);
         this.d = new evn(ffq.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               ffq.this.b(this);
            } else {
               this.d.m(16711680);
               ffq.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends evk.a<ffq.f> {
      @Nullable
      final List<atc> a;

      public f(@Nullable List<atc> $$0) {
         this.a = $$0;
      }
   }

   public class g extends evk<ffq.f> {
      public g(final csb $$1) {
         super(ffq.this.f, ffq.this.g, ffq.this.h, 43, ffq.this.h - 32, 24);
         final Map<csb.b, Map<csb.e<?>, ffq.f>> $$2 = Maps.newHashMap();
         csb.a(new csb.c() {
            @Override
            public void b(csb.e<csb.a> $$0, csb.f<csb.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ffq.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(csb.e<csb.d> $$0, csb.f<csb.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ffq.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends csb.g<T>> void a(csb.e<T> $$0, ffq.c<T> $$1x) {
               uv $$2 = uv.c($$0.b());
               uv $$3 = uv.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               uv $$6 = uv.a("editGamerule.default", uv.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<atc> $$10;
               String $$11;
               if (gdf.a($$7)) {
                  Builder<atc> $$8 = ImmutableList.builder().add($$3.g());
                  uv $$9 = uv.c($$7);
                  ffq.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(ffq.this.new b(uv.c(((csb.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(csb.e::a)))
                     .forEach($$0xx -> this.b((ffq.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         ffq.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            ffq.this.b($$4.a);
         }
      }
   }
}
