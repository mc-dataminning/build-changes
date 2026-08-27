import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class eht extends eib {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekd.a.fieldOf("source").forGetter($$0x -> $$0x.b), eht.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eht::new)
   );
   private final ekc b;
   private final List<eht.b> c;

   eht(List<ejo> $$0, ekc $$1, List<eht.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eid b() {
      return eie.w;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.b();
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      ti $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static eht.a a(ekc $$0) {
      return new eht.a($$0);
   }

   public static eht.a a(egp.b $$0) {
      return new eht.a(eka.a($$0));
   }

   public static class a extends eib.a<eht.a> {
      private final ekc a;
      private final List<eht.b> b = Lists.newArrayList();

      a(ekc $$0) {
         this.a = $$0;
      }

      public eht.a a(String $$0, String $$1, eht.c $$2) {
         try {
            this.b.add(new eht.b(eht.d.a($$0), eht.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eht.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eht.c.a);
      }

      protected eht.a a() {
         return this;
      }

      @Override
      public eic b() {
         return new eht(this.g(), this.a, this.b);
      }
   }

   static record b(eht.d b, eht.d c, eht.c d) {
      public static final Codec<eht.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eht.d.a.fieldOf("source").forGetter(eht.b::a), eht.d.a.fieldOf("target").forGetter(eht.b::b), eht.c.d.fieldOf("op").forGetter(eht.b::c)
               )
               .apply($$0, eht.b::new)
      );

      public void a(Supplier<ti> $$0, ti $$1) {
         try {
            List<ti> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public eht.d a() {
         return this.b;
      }

      public eht.d b() {
         return this.c;
      }

      public eht.c c() {
         return this.d;
      }
   }

   public static enum c implements ave {
      a("replace") {
         @Override
         public void a(ti $$0, ek.g $$1, List<ti> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ti)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ti $$0, ek.g $$1, List<ti> $$2) throws CommandSyntaxException {
            List<ti> $$3 = $$1.a($$0, sr::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sr) {
                  $$2.forEach($$1xx -> ((sr)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ti $$0, ek.g $$1, List<ti> $$2) throws CommandSyntaxException {
            List<ti> $$3 = $$1.a($$0, sl::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sl) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sl) {
                        ((sl)$$1x).a((sl)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eht.c> d = ave.a(eht.c::values);
      private final String e;

      public abstract void a(ti var1, ek.g var2, List<ti> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ek.g c) {
      public static final Codec<eht.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eht.d::a);

      public static eht.d a(String $$0) throws CommandSyntaxException {
         ek.g $$1 = new ek().a(new StringReader($$0));
         return new eht.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ek.g b() {
         return this.c;
      }
   }
}
