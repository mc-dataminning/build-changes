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

public class exj extends exv {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fag.a.fieldOf("source").forGetter($$0x -> $$0x.b), exj.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, exj::new)
   );
   private final faf b;
   private final List<exj.b> c;

   exj(List<ezr> $$0, faf $$1, List<exj.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exx<exj> b() {
      return exy.C;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.b();
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      vj $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<um> $$3 = new MutableObject();
         Supplier<vj> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, czp.a).d());
            }

            return (vj)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         um $$5 = (um)$$3.getValue();
         if ($$5 != null) {
            czp.a(ku.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static exj.a a(faf $$0) {
      return new exj.a($$0);
   }

   public static exj.a a(ewi.b $$0) {
      return new exj.a(fad.a($$0));
   }

   public static class a extends exv.a<exj.a> {
      private final faf a;
      private final List<exj.b> b = Lists.newArrayList();

      a(faf $$0) {
         this.a = $$0;
      }

      public exj.a a(String $$0, String $$1, exj.c $$2) {
         try {
            this.b.add(new exj.b(fo.g.a($$0), fo.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public exj.a a(String $$0, String $$1) {
         return this.a($$0, $$1, exj.c.a);
      }

      protected exj.a a() {
         return this;
      }

      @Override
      public exw b() {
         return new exj(this.g(), this.a, this.b);
      }
   }

   static record b(fo.g b, fo.g c, exj.c d) {
      public static final Codec<exj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(exj.b::a), fo.g.a.fieldOf("target").forGetter(exj.b::b), exj.c.d.fieldOf("op").forGetter(exj.b::c))
               .apply($$0, exj.b::new)
      );

      public void a(Supplier<vj> $$0, vj $$1) {
         try {
            List<vj> $$2 = this.b.a($$1);
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

      public exj.c c() {
         return this.d;
      }
   }

   public static enum c implements baq {
      a("replace") {
         @Override
         public void a(vj $$0, fo.g $$1, List<vj> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vj)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vj $$0, fo.g $$1, List<vj> $$2) throws CommandSyntaxException {
            List<vj> $$3 = $$1.a($$0, us::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof us) {
                  $$2.forEach($$1xx -> ((us)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vj $$0, fo.g $$1, List<vj> $$2) throws CommandSyntaxException {
            List<vj> $$3 = $$1.a($$0, um::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof um) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof um) {
                        ((um)$$1x).a((um)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<exj.c> d = baq.a(exj.c::values);
      private final String e;

      public abstract void a(vj var1, fo.g var2, List<vj> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
