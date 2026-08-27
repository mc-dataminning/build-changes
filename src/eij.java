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

public class eij extends eir {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekt.a.fieldOf("source").forGetter($$0x -> $$0x.b), eij.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eij::new)
   );
   private final eks b;
   private final List<eij.b> c;

   eij(List<eke> $$0, eks $$1, List<eij.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eit b() {
      return eiu.w;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.b();
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      tl $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static eij.a a(eks $$0) {
      return new eij.a($$0);
   }

   public static eij.a a(ehf.b $$0) {
      return new eij.a(ekq.a($$0));
   }

   public static class a extends eir.a<eij.a> {
      private final eks a;
      private final List<eij.b> b = Lists.newArrayList();

      a(eks $$0) {
         this.a = $$0;
      }

      public eij.a a(String $$0, String $$1, eij.c $$2) {
         try {
            this.b.add(new eij.b(eij.d.a($$0), eij.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eij.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eij.c.a);
      }

      protected eij.a a() {
         return this;
      }

      @Override
      public eis b() {
         return new eij(this.g(), this.a, this.b);
      }
   }

   static record b(eij.d b, eij.d c, eij.c d) {
      public static final Codec<eij.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eij.d.a.fieldOf("source").forGetter(eij.b::a), eij.d.a.fieldOf("target").forGetter(eij.b::b), eij.c.d.fieldOf("op").forGetter(eij.b::c)
               )
               .apply($$0, eij.b::new)
      );

      public void a(Supplier<tl> $$0, tl $$1) {
         try {
            List<tl> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public eij.d a() {
         return this.b;
      }

      public eij.d b() {
         return this.c;
      }

      public eij.c c() {
         return this.d;
      }
   }

   public static enum c implements avl {
      a("replace") {
         @Override
         public void a(tl $$0, ek.g $$1, List<tl> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tl)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tl $$0, ek.g $$1, List<tl> $$2) throws CommandSyntaxException {
            List<tl> $$3 = $$1.a($$0, su::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof su) {
                  $$2.forEach($$1xx -> ((su)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tl $$0, ek.g $$1, List<tl> $$2) throws CommandSyntaxException {
            List<tl> $$3 = $$1.a($$0, so::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof so) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof so) {
                        ((so)$$1x).a((so)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eij.c> d = avl.a(eij.c::values);
      private final String e;

      public abstract void a(tl var1, ek.g var2, List<tl> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ek.g c) {
      public static final Codec<eij.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eij.d::a);

      public static eij.d a(String $$0) throws CommandSyntaxException {
         ek.g $$1 = new ek().a(new StringReader($$0));
         return new eij.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ek.g b() {
         return this.c;
      }
   }
}
