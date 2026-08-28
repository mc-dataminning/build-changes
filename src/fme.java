import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fme implements Comparable<fme> {
   private static final Map<String, fme> h = Maps.newHashMap();
   private static final Map<ffm.a, fme> i = Maps.newHashMap();
   private static final Set<String> j = Sets.newHashSet();
   public static final String a = "key.categories.movement";
   public static final String b = "key.categories.misc";
   public static final String c = "key.categories.multiplayer";
   public static final String d = "key.categories.gameplay";
   public static final String e = "key.categories.inventory";
   public static final String f = "key.categories.ui";
   public static final String g = "key.categories.creative";
   private static final Map<String, Integer> k = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put("key.categories.movement", 1);
      $$0.put("key.categories.gameplay", 2);
      $$0.put("key.categories.inventory", 3);
      $$0.put("key.categories.creative", 4);
      $$0.put("key.categories.multiplayer", 5);
      $$0.put("key.categories.ui", 6);
      $$0.put("key.categories.misc", 7);
   });
   private final String l;
   private final ffm.a m;
   private final String n;
   private ffm.a o;
   private boolean p;
   private int q;

   public static void a(ffm.a $$0) {
      fme $$1 = i.get($$0);
      if ($$1 != null) {
         $$1.q++;
      }
   }

   public static void a(ffm.a $$0, boolean $$1) {
      fme $$2 = i.get($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   public static void a() {
      for (fme $$0 : h.values()) {
         if ($$0.o.a() == ffm.b.a && $$0.o.b() != ffm.bv.b()) {
            $$0.a(ffm.a(fmg.Q().aO().h(), $$0.o.b()));
         }
      }
   }

   public static void b() {
      for (fme $$0 : h.values()) {
         $$0.n();
      }
   }

   public static void c() {
      for (fme $$0 : h.values()) {
         if ($$0 instanceof fmr $$1) {
            $$1.n();
         }
      }
   }

   public static void d() {
      i.clear();

      for (fme $$0 : h.values()) {
         i.put($$0.o, $$0);
      }
   }

   public fme(String $$0, int $$1, String $$2) {
      this($$0, ffm.b.a, $$1, $$2);
   }

   public fme(String $$0, ffm.b $$1, int $$2, String $$3) {
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

   public ffm.a i() {
      return this.m;
   }

   public void b(ffm.a $$0) {
      this.o = $$0;
   }

   public int a(fme $$0) {
      return this.n.equals($$0.n) ? hgz.a(this.l).compareTo(hgz.a($$0.l)) : k.get(this.n).compareTo(k.get($$0.n));
   }

   public static Supplier<wp> a(String $$0) {
      fme $$1 = h.get($$0);
      return $$1 == null ? () -> wp.c($$0) : $$1::k;
   }

   public boolean b(fme $$0) {
      return this.o.equals($$0.o);
   }

   public boolean j() {
      return this.o.equals(ffm.bv);
   }

   public boolean a(int $$0, int $$1) {
      return $$0 == ffm.bv.b() ? this.o.a() == ffm.b.b && this.o.b() == $$1 : this.o.a() == ffm.b.a && this.o.b() == $$0;
   }

   public boolean a(int $$0) {
      return this.o.a() == ffm.b.c && this.o.b() == $$0;
   }

   public wp k() {
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
   public static fme b(String $$0) {
      return h.get($$0);
   }
}
