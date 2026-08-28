import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aek implements zk<abz> {
   public static final zb<wa, aek> a = zk.a(aek::a, aek::new);
   private final aek.a b;
   private final List<alc> c;
   private final List<alc> d;
   private final awi e;

   public aek(aek.a $$0, Collection<alc> $$1, Collection<alc> $$2, awi $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aek(wa $$0) {
      this.b = $$0.b(aek.a.class);
      this.e = awi.a($$0);
      this.c = $$0.a(wa::q);
      if (this.b == aek.a.a) {
         this.d = $$0.a(wa::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wa::a);
      if (this.b == aek.a.a) {
         $$0.a(this.d, wa::a);
      }
   }

   @Override
   public zm<aek> a() {
      return ago.aj;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public List<alc> b() {
      return this.c;
   }

   public List<alc> e() {
      return this.d;
   }

   public awi f() {
      return this.e;
   }

   public aek.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
