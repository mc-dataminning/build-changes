import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewo {
   private final ewr a;
   private final bam b;
   private final jr.a c;
   private final Set<ewo.c<?>> d = Sets.newLinkedHashSet();

   ewo(ewr $$0, bam $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bbn<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bbn<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bbn<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alz $$0, Consumer<cxo> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ewo.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ewo.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ewo.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public bam b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public ash d() {
      return this.a.a();
   }

   public static ewo.c<ewt> a(ewt $$0) {
      return new ewo.c<>(ewq.c, $$0);
   }

   public static ewo.c<ezx> a(ezx $$0) {
      return new ewo.c<>(ewq.a, $$0);
   }

   public static ewo.c<eyc> a(eyc $$0) {
      return new ewo.c<>(ewq.b, $$0);
   }

   public static class a {
      private final ewr a;
      @Nullable
      private bam b;

      public a(ewr $$0) {
         this.a = $$0;
      }

      public ewo.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bam.a($$0);
         }

         return this;
      }

      public ewo.a a(bam $$0) {
         this.b = $$0;
         return this;
      }

      public ash a() {
         return this.a.a();
      }

      public ewo a(Optional<alz> $$0) {
         ash $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         bam $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new ewo(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bba {
      a("this", ezi.a),
      b("attacker", ezi.d),
      c("direct_attacker", ezi.e),
      d("attacking_player", ezi.b);

      public static final bba.a<ewo.b> e = bba.a(ewo.b::values);
      private final String f;
      private final bbn<? extends bvj> g;

      private b(final String $$0, final bbn<? extends bvj> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bbn<? extends bvj> a() {
         return this.g;
      }

      public static ewo.b a(String $$0) {
         ewo.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(ewq<T> a, T b) {
   }
}
