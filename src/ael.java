import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class ael implements zl<aca> {
   public static final zc<wb, ael> a = zl.a(ael::a, ael::new);
   private final ael.a b;
   private final List<ale> c;
   private final List<ale> d;
   private final awk e;

   public ael(ael.a $$0, Collection<ale> $$1, Collection<ale> $$2, awk $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private ael(wb $$0) {
      this.b = $$0.b(ael.a.class);
      this.e = awk.a($$0);
      this.c = $$0.a(wb::q);
      if (this.b == ael.a.a) {
         this.d = $$0.a(wb::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wb::a);
      if (this.b == ael.a.a) {
         $$0.a(this.d, wb::a);
      }
   }

   @Override
   public zn<ael> a() {
      return agp.aj;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public List<ale> b() {
      return this.c;
   }

   public List<ale> e() {
      return this.d;
   }

   public awk f() {
      return this.e;
   }

   public ael.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
