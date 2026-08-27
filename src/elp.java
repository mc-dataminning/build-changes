import com.google.common.collect.ImmutableMap;

public class elp {
   public static final elx a = new elx(0, elx.a.a, elx.b.a, 3);
   public static final elx b = new elx(0, elx.a.b, elx.b.c, 4);
   public static final elx c = new elx(0, elx.a.a, elx.b.d, 2);
   public static final elx d = new elx(1, elx.a.e, elx.b.d, 2);
   public static final elx e = new elx(2, elx.a.e, elx.b.d, 2);
   public static final elx f = new elx(0, elx.a.c, elx.b.b, 3);
   public static final elx g = new elx(0, elx.a.c, elx.b.e, 1);
   public static final elx h = c;
   public static final elw i = new elw(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final elw j = new elw(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final elw k = new elw(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final elw l = new elw(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final elw m = new elw(ImmutableMap.builder().put("Position", a).build());
   public static final elw n = new elw(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final elw o = new elw(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final elw p = new elw(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final elw q = new elw(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final elw r = new elw(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final elw s = new elw(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final elw t = new elw(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final elw u = new elw(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final elw v = new elw(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
