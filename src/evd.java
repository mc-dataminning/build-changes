import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class evd extends evp {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyc.a.fieldOf("source").forGetter($$0x -> $$0x.b), evd.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, evd::new)
   );
   private final eyb b;
   private final List<evd.b> c;

   evd(List<exn> $$0, eyb $$1, List<evd.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evr<evd> b() {
      return evs.C;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.b();
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      vh $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<uk> $$3 = new MutableObject();
         Supplier<vh> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, cyk.a).c());
            }

            return (vh)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         uk $$5 = (uk)$$3.getValue();
         if ($$5 != null) {
            cyk.a(ku.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static evd.a a(eyb $$0) {
      return new evd.a($$0);
   }

   public static evd.a a(euc.b $$0) {
      return new evd.a(exz.a($$0));
   }

   public static class a extends evp.a<evd.a> {
      private final eyb a;
      private final List<evd.b> b = Lists.newArrayList();

      a(eyb $$0) {
         this.a = $$0;
      }

      public evd.a a(String $$0, String $$1, evd.c $$2) {
         try {
            this.b.add(new evd.b(fo.g.a($$0), fo.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public evd.a a(String $$0, String $$1) {
         return this.a($$0, $$1, evd.c.a);
      }

      protected evd.a a() {
         return this;
      }

      @Override
      public evq b() {
         return new evd(this.g(), this.a, this.b);
      }
   }

   static record b(fo.g b, fo.g c, evd.c d) {
      public static final Codec<evd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(evd.b::a), fo.g.a.fieldOf("target").forGetter(evd.b::b), evd.c.d.fieldOf("op").forGetter(evd.b::c))
               .apply($$0, evd.b::new)
      );

      public void a(Supplier<vh> $$0, vh $$1) {
         try {
            List<vh> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fo.g a() {
         return this.b;
      }

      public fo.g b() {
         return this.c;
      }

      public evd.c c() {
         return this.d;
      }
   }

   public static enum c implements bag {
      a("replace") {
         @Override
         public void a(vh $$0, fo.g $$1, List<vh> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vh)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vh $$0, fo.g $$1, List<vh> $$2) throws CommandSyntaxException {
            List<vh> $$3 = $$1.a($$0, uq::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uq) {
                  $$2.forEach($$1xx -> ((uq)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vh $$0, fo.g $$1, List<vh> $$2) throws CommandSyntaxException {
            List<vh> $$3 = $$1.a($$0, uk::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uk) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof uk) {
                        ((uk)$$1x).a((uk)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<evd.c> d = bag.a(evd.c::values);
      private final String e;

      public abstract void a(vh var1, fo.g var2, List<vh> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
