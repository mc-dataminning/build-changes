import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record ddb(List<ddb.b> e) {
   public static final ddb a = new ddb(List.of());
   public static final Codec<ddb> b = ddb.b.a.listOf().xmap(ddb::new, ddb::b);
   public static final ze<wp, ddb> c = ze.a(ddb.b.b.a(zc.a()), ddb::b, ddb::new);
   public static final DecimalFormat d = ag.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static ddb.a a() {
      return new ddb.a();
   }

   public ddb a(jg<bzg> $$0, bzj $$1, bxp $$2) {
      Builder<ddb.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (ddb.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new ddb.b($$0, $$1, $$2));
      return new ddb($$3.build());
   }

   public void a(bxp $$0, BiConsumer<jg<bzg>, bzj> $$1) {
      for (ddb.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bxo $$0, BiConsumer<jg<bzg>, bzj> $$1) {
      for (ddb.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bxo $$1) {
      double $$2 = $$0;

      for (ddb.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.b();

            $$2 += switch ($$3.d.c()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<ddb.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<ddb.b> a = ImmutableList.builder();

      a() {
      }

      public ddb.a a(jg<bzg> $$0, bzj $$1, bxp $$2) {
         this.a.add(new ddb.b($$0, $$1, $$2));
         return this;
      }

      public ddb a() {
         return new ddb(this.a.build());
      }
   }

   public static record b(jg<bzg> c, bzj d, bxp e) {
      public static final Codec<ddb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bzg.a.fieldOf("type").forGetter(ddb.b::a), bzj.a.forGetter(ddb.b::b), bxp.m.optionalFieldOf("slot", bxp.a).forGetter(ddb.b::c))
               .apply($$0, ddb.b::new)
      );
      public static final ze<wp, ddb.b> b = ze.a(bzg.b, ddb.b::a, bzj.c, ddb.b::b, bxp.n, ddb.b::c, ddb.b::new);

      public boolean a(jg<bzg> $$0, alr $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jg<bzg> a() {
         return this.c;
      }

      public bzj b() {
         return this.d;
      }

      public bxp c() {
         return this.e;
      }
   }
}
