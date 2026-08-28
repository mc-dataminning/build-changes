package com.mojang.blaze3d.font;

import net.minecraft.client.gui.font.glyphs.BakedGlyph;

public interface UnbakedGlyph {
   GlyphInfo info();

   BakedGlyph bake(UnbakedGlyph.Stitcher stitcher);

   public interface Stitcher {
      BakedGlyph stitch(GlyphInfo info, GlyphBitmap glyphBitmap);

      BakedGlyph getMissing();
   }
}
