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

public class eqg extends eqq {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eta.a.fieldOf("source").forGetter($$0x -> $$0x.b), eqg.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eqg::new)
   );
   private final esz b;
   private final List<eqg.b> c;

   eqg(List<esl> $$0, esz $$1, List<eqg.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eqs b() {
      return eqt.z;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.b();
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      va $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ud> $$3 = new MutableObject();
         Supplier<va> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kb.a, cwd.a).c());
            }

            return (va)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ud $$5 = (ud)$$3.getValue();
         if ($$5 != null) {
            cwd.a(kb.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eqg.a a(esz $$0) {
      return new eqg.a($$0);
   }

   public static eqg.a a(epf.b $$0) {
      return new eqg.a(esx.a($$0));
   }

   public static class a extends eqq.a<eqg.a> {
      private final esz a;
      private final List<eqg.b> b = Lists.newArrayList();

      a(esz $$0) {
         this.a = $$0;
      }

      public eqg.a a(String $$0, String $$1, eqg.c $$2) {
         try {
            this.b.add(new eqg.b(ew.g.a($$0), ew.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eqg.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eqg.c.a);
      }

      protected eqg.a a() {
         return this;
      }

      @Override
      public eqr b() {
         return new eqg(this.g(), this.a, this.b);
      }
   }

   static record b(ew.g b, ew.g c, eqg.c d) {
      public static final Codec<eqg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ew.g.a.fieldOf("source").forGetter(eqg.b::a), ew.g.a.fieldOf("target").forGetter(eqg.b::b), eqg.c.d.fieldOf("op").forGetter(eqg.b::c))
               .apply($$0, eqg.b::new)
      );

      public void a(Supplier<va> $$0, va $$1) {
         try {
            List<va> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ew.g a() {
         return this.b;
      }

      public ew.g b() {
         return this.c;
      }

      public eqg.c c() {
         return this.d;
      }
   }

   public static enum c implements ayx {
      a("replace") {
         @Override
         public void a(va $$0, ew.g $$1, List<va> $$2) throws CommandSyntaxException {
            $$1.a($$0, (va)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(va $$0, ew.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, uj::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uj) {
                  $$2.forEach($$1xx -> ((uj)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(va $$0, ew.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, ud::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ud) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ud) {
                        ((ud)$$1x).a((ud)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eqg.c> d = ayx.a(eqg.c::values);
      private final String e;

      public abstract void a(va var1, ew.g var2, List<va> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
