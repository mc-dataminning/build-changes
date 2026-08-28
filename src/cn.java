import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cn extends dk<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(arr $$0, iv $$1, czn $$2) {
      arq $$3 = $$0.y();
      eat $$4 = $$3.a_($$1);
      ezw $$5 = new ezw.a($$3).a(fcn.f, $$1.b()).a(fcn.a, $$0).a(fcn.g, $$4).a(fcn.i, $$2).a(fcm.o);
      ezt $$6 = new ezt.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(cn.a::a), bj.a.optionalFieldOf("location").forGetter(cn.a::b)).apply($$0, cn.a::new)
      );

      public static ar<cn.a> a(dmr $$0) {
         bj $$1 = bj.a(fdb.a($$0).build());
         return aq.z.a(new cn.a(Optional.empty(), Optional.of($$1)));
      }

      public static ar<cn.a> a(fdc.a... $$0) {
         bj $$1 = bj.a(Arrays.stream($$0).map(fdc.a::build).toArray(fdc[]::new));
         return aq.z.a(new cn.a(Optional.empty(), Optional.of($$1)));
      }

      private static cn.a c(cu.a $$0, cm.a $$1) {
         bj $$2 = bj.a(fda.a($$0).build(), fdj.a($$1).build());
         return new cn.a(Optional.empty(), Optional.of($$2));
      }

      public static ar<cn.a> a(cu.a $$0, cm.a $$1) {
         return aq.N.a(c($$0, $$1));
      }

      public static ar<cn.a> b(cu.a $$0, cm.a $$1) {
         return aq.aa.a(c($$0, $$1));
      }

      public boolean a(ezt $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fcm.o, ".location"));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }
   }
}
