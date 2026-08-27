import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eeg extends eds {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  aqy.b.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  aqy.a(ecg.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eeg::new)
   );
   private final boolean b;
   private final List<tf> c;
   private final Optional<ecg.b> d;

   public eeg(List<eff> $$0, boolean $$1, List<tf> $$2, Optional<ecg.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public edu b() {
      return edv.u;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.d.<Set<eeo<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      qx $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<tf> $$3 = eeh.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(tf.a::a).map(ri::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private qx a(cix $$0, boolean $$1) {
      qr $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qr();
         $$0.c($$2);
      }

      qr $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qr();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         qx $$8 = new qx();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eeg.a c() {
      return new eeg.a();
   }

   public static class a extends eds.a<eeg.a> {
      private boolean a;
      private Optional<ecg.b> b = Optional.empty();
      private final Builder<tf> c = ImmutableList.builder();

      public eeg.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eeg.a a(ecg.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eeg.a a(tf $$0) {
         this.c.add($$0);
         return this;
      }

      protected eeg.a a() {
         return this;
      }

      @Override
      public edt b() {
         return new eeg(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
