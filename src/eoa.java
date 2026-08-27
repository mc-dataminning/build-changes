import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eoa {
   private final eog a;
   private final ayd b;
   private final eoe c;
   private final Set<eoa.c<?>> d = Sets.newLinkedHashSet();

   eoa(eog $$0, ayd $$1, eoe $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eqq<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eqq<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akf $$0, Consumer<csd> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eqq<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eoa.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eoa.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eoa.c<?> $$0) {
      this.d.remove($$0);
   }

   public eoe a() {
      return this.c;
   }

   public ayd b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqe d() {
      return this.a.a();
   }

   public static eoa.c<eoi> a(eoi $$0) {
      return new eoa.c<>(eof.c, $$0);
   }

   public static eoa.c<erh> a(erh $$0) {
      return new eoa.c<>(eof.a, $$0);
   }

   public static eoa.c<epp> a(epp $$0) {
      return new eoa.c<>(eof.b, $$0);
   }

   public static class a {
      private final eog a;
      @Nullable
      private ayd b;

      public a(eog $$0) {
         this.a = $$0;
      }

      public eoa.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayd.a($$0);
         }

         return this;
      }

      public aqe a() {
         return this.a.a();
      }

      public eoa a(Optional<akf> $$0) {
         aqe $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayd $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eoa(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements ayq {
      a("this", eqt.a),
      b("killer", eqt.d),
      c("direct_killer", eqt.e),
      d("killer_player", eqt.b);

      public static final ayq.a<eoa.b> e = ayq.a(eoa.b::values);
      private final String f;
      private final eqq<? extends bql> g;

      private b(String $$0, eqq<? extends bql> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eqq<? extends bql> a() {
         return this.g;
      }

      public static eoa.b a(String $$0) {
         eoa.b $$1 = e.a($$0);
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

   public static record c<T>(eof<T> a, T b) {
   }
}
