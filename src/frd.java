import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frd implements Comparable<frd> {
   private static final Map<String, frd> h = Maps.newHashMap();
   private static final Map<fkc.a, frd> i = Maps.newHashMap();
   private static final Set<String> j = Sets.newHashSet();
   public static final String a = "key.categories.movement";
   public static final String b = "key.categories.misc";
   public static final String c = "key.categories.multiplayer";
   public static final String d = "key.categories.gameplay";
   public static final String e = "key.categories.inventory";
   public static final String f = "key.categories.ui";
   public static final String g = "key.categories.creative";
   private static final Map<String, Integer> k = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put("key.categories.movement", 1);
      $$0.put("key.categories.gameplay", 2);
      $$0.put("key.categories.inventory", 3);
      $$0.put("key.categories.creative", 4);
      $$0.put("key.categories.multiplayer", 5);
      $$0.put("key.categories.ui", 6);
      $$0.put("key.categories.misc", 7);
   });
   private final String l;
   private final fkc.a m;
   private final String n;
   private fkc.a o;
   private boolean p;
   private int q;

   public static void a(fkc.a $$0) {
      frd $$1 = i.get($$0);
      if ($$1 != null) {
         $$1.q++;
      }
   }

   public static void a(fkc.a $$0, boolean $$1) {
      frd $$2 = i.get($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   public static void a() {
      for (frd $$0 : h.values()) {
         if ($$0.o.a() == fkc.b.a && $$0.o.b() != fkc.bv.b()) {
            $$0.a(fkc.a(frf.Q().aO().h(), $$0.o.b()));
         }
      }
   }

   public static void b() {
      for (frd $$0 : h.values()) {
         $$0.n();
      }
   }

   public static void c() {
      for (frd $$0 : h.values()) {
         if ($$0 instanceof frq $$1) {
            $$1.n();
         }
      }
   }

   public static void d() {
      i.clear();

      for (frd $$0 : h.values()) {
         i.put($$0.o, $$0);
      }
   }

   public frd(String $$0, int $$1, String $$2) {
      this($$0, fkc.b.a, $$1, $$2);
   }

   public frd(String $$0, fkc.b $$1, int $$2, String $$3) {
      this.l = $$0;
      this.o = $$1.a($$2);
      this.m = this.o;
      this.n = $$3;
      h.put($$0, this);
      i.put(this.o, this);
      j.add($$3);
   }

   public boolean e() {
      return this.p;
   }

   public String f() {
      return this.n;
   }

   public boolean g() {
      if (this.q == 0) {
         return false;
      } else {
         this.q--;
         return true;
      }
   }

   private void n() {
      this.q = 0;
      this.a(false);
   }

   public String h() {
      return this.l;
   }

   public fkc.a i() {
      return this.m;
   }

   public void b(fkc.a $$0) {
      this.o = $$0;
   }

   public int a(frd $$0) {
      return this.n.equals($$0.n) ? hmk.a(this.l).compareTo(hmk.a($$0.l)) : k.get(this.n).compareTo(k.get($$0.n));
   }

   public static Supplier<xc> a(String $$0) {
      frd $$1 = h.get($$0);
      return $$1 == null ? () -> xc.c($$0) : $$1::k;
   }

   public boolean b(frd $$0) {
      return this.o.equals($$0.o);
   }

   public boolean j() {
      return this.o.equals(fkc.bv);
   }

   public boolean a(int $$0, int $$1) {
      return $$0 == fkc.bv.b() ? this.o.a() == fkc.b.b && this.o.b() == $$1 : this.o.a() == fkc.b.a && this.o.b() == $$0;
   }

   public boolean a(int $$0) {
      return this.o.a() == fkc.b.c && this.o.b() == $$0;
   }

   public xc k() {
      return this.o.d();
   }

   public boolean l() {
      return this.o.equals(this.m);
   }

   public String m() {
      return this.o.c();
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   @Nullable
   public static frd b(String $$0) {
      return h.get($$0);
   }
}
