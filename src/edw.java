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

public class edw extends eee {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egg.a.fieldOf("source").forGetter($$0x -> $$0x.b), edw.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edw::new)
   );
   private final egf b;
   private final List<edw.b> c;

   edw(List<efr> $$0, egf $$1, List<edw.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eeg b() {
      return eeh.w;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.b();
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      rs $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edw.a a(egf $$0) {
      return new edw.a($$0);
   }

   public static edw.a a(ecs.b $$0) {
      return new edw.a(egd.a($$0));
   }

   public static class a extends eee.a<edw.a> {
      private final egf a;
      private final List<edw.b> b = Lists.newArrayList();

      a(egf $$0) {
         this.a = $$0;
      }

      public edw.a a(String $$0, String $$1, edw.c $$2) {
         try {
            this.b.add(new edw.b(edw.d.a($$0), edw.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edw.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edw.c.a);
      }

      protected edw.a a() {
         return this;
      }

      @Override
      public eef b() {
         return new edw(this.g(), this.a, this.b);
      }
   }

   static record b(edw.d b, edw.d c, edw.c d) {
      public static final Codec<edw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edw.d.a.fieldOf("source").forGetter(edw.b::a), edw.d.a.fieldOf("target").forGetter(edw.b::b), edw.c.d.fieldOf("op").forGetter(edw.b::c)
               )
               .apply($$0, edw.b::new)
      );

      public void a(Supplier<rs> $$0, rs $$1) {
         try {
            List<rs> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public edw.d a() {
         return this.b;
      }

      public edw.d b() {
         return this.c;
      }

      public edw.c c() {
         return this.d;
      }
   }

   public static enum c implements asr {
      a("replace") {
         @Override
         public void a(rs $$0, ej.g $$1, List<rs> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rs)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rs $$0, ej.g $$1, List<rs> $$2) throws CommandSyntaxException {
            List<rs> $$3 = $$1.a($$0, re::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof re) {
                  $$2.forEach($$1xx -> ((re)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rs $$0, ej.g $$1, List<rs> $$2) throws CommandSyntaxException {
            List<rs> $$3 = $$1.a($$0, qy::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qy) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qy) {
                        ((qy)$$1x).a((qy)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<edw.c> d = asr.a(edw.c::values);
      private final String e;

      public abstract void a(rs var1, ej.g var2, List<rs> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ej.g c) {
      public static final Codec<edw.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edw.d::a);

      public static edw.d a(String $$0) throws CommandSyntaxException {
         ej.g $$1 = new ej().a(new StringReader($$0));
         return new edw.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ej.g b() {
         return this.c;
      }
   }
}
