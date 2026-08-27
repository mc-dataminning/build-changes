import com.mojang.serialization.Codec;

public class dpl<P extends dpk> {
   public static final dpl<dpm> a = a("trunk_vine", dpm.a);
   public static final dpl<dpj> b = a("leave_vine", dpj.a);
   public static final dpl<dpi> c = a("cocoa", dpi.a);
   public static final dpl<dph> d = a("beehive", dph.a);
   public static final dpl<dpf> e = a("alter_ground", dpf.a);
   public static final dpl<dpg> f = a("attached_to_leaves", dpg.a);
   private final Codec<P> g;

   private static <P extends dpk> dpl<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.aa, $$0, new dpl<>($$1));
   }

   private dpl(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
