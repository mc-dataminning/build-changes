import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfe {
   private final dek a;
   private final ebm b;
   private final elh c;

   public dfe(dek $$0, ebm $$1, elh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfe a(arq $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dfe($$0, this.b, this.c);
      }
   }

   public List<elo> a(ddp $$0, Predicate<elg> $$1) {
      Map<elg, LongSet> $$2 = this.a.a($$0.e, $$0.f, dxp.e).h();
      Builder<elo> $$3 = ImmutableList.builder();

      for (Entry<elg, LongSet> $$4 : $$2.entrySet()) {
         elg $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<elo> a(kh $$0, elg $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dxp.e).b($$1);
      Builder<elo> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(elg $$0, LongSet $$1, Consumer<elo> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kh $$4 = kh.a(new ddp($$3), this.a.ap());
         elo $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dxp.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public elo a(kh $$0, elg $$1, dxk $$2) {
      return $$2.a($$1);
   }

   public void a(kh $$0, elg $$1, elo $$2, dxk $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kh $$0, elg $$1, long $$2, dxk $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public elo a(jf $$0, elg $$1) {
      for (elo $$2 : this.a(kh.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return elo.b;
   }

   public elo a(jf $$0, axl<elg> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public elo a(jf $$0, js<elg> $$1) {
      return this.a($$0, $$1::a);
   }

   public elo a(jf $$0, Predicate<jo<elg>> $$1) {
      kb<elg> $$2 = this.b().e(lw.aT);

      for (elo $$3 : this.a(new ddp($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return elo.b;
   }

   public elo b(jf $$0, elg $$1) {
      for (elo $$2 : this.a(kh.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return elo.b;
   }

   public boolean a(jf $$0, elo $$1) {
      for (elk $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jf $$0) {
      kh $$1 = kh.a($$0);
      return this.a.a($$1.a(), $$1.c(), dxp.e).v();
   }

   public Map<elg, LongSet> b(jf $$0) {
      kh $$1 = kh.a($$0);
      return this.a.a($$1.a(), $$1.c(), dxp.e).h();
   }

   public eli a(ddp $$0, elg $$1, emd $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(elo $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kc b() {
      return this.a.G_();
   }
}
